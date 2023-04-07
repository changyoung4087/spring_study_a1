package exam03.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    void insert() {
        String sql = "INSERT INTO DEPT_EX VALUES (?, ?, ?)";
        int cnt = jdbcTemplate.update(sql, 10, "부서명", "인천");
    }
}
