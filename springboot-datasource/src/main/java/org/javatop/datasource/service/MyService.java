package org.javatop.datasource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-19 11:28
 * @description :
 */
@Service
public class MyService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MyService(@Qualifier("dataSourceBean") DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void executeQuery() {
        String sql = "SELECT * FROM user";
        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);
        results.forEach(System.out::println);
    }
}
