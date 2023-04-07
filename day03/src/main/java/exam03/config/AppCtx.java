package exam03.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppCtx {

    @Bean
    public DataSource dataSource(){
        /** DB정보 */
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        DataSource ds = new DataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl(url);
        ds.setUsername("scott");
        ds.setPassword("tiger");
        /** DB정보 */

        /** 연결 커넥션 체크 */
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true);
        ds.setTimeBetweenEvictionRunsMillis(3000);  // 3초마다 유효객체 확인 // 밀리세컨드 1000초가 1초
        ds.setMinEvictableIdleTimeMillis(60000);  // 60초 이후 연결객체 다시 생성 // 밀리세컨드 1000초가 1초
        /** 연결 커넥션 체크 */
        return ds;
    }
    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());

        return jdbcTemplate;
    }
    @Bean
    public TestDao testDao() {
        return new TestDao();
    }
}
