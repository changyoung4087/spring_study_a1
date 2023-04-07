package config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
@ComponentScan("models")
public class AppCtx {

    @Bean(destroyMethod = "close") // 자원해제
    public DataSource dataSource(){
        DataSource ds = new DataSource();
        /** db 접속 설정 */
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        ds.setUsername("springdb");
        ds.setPassword("aA123456");
        /** db 접속 설정 */
        /** 커넥션풀 설정 */
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true); // 체크여부
        ds.setTimeBetweenEvictionRunsMillis(3000); // 체크 주기 3초
        ds.setMinEvictableIdleTimeMillis(60000); // 1분 유지 후 삭제
        /** 커넥션풀 설정 */

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
    /** 트랜젝션 자동관리 */
    @Bean
    public PlatformTransactionManager transactionManager(){
        DataSourceTransactionManager tm = new DataSourceTransactionManager();
        tm.setDataSource(dataSource());
        return tm;
    }
}
