package com.lib.dao;

import com.lib.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TR on 5/25/2016.
 */
@Repository
public class UserDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Users> loadAll() {
        String sql = "SELECT * FROM users";
        List<Users> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Users.class));
        return result;
    }
}
