package com.lib.dao;

import com.lib.domain.Book;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by lanhnguyen on 14/03/2016.
 */

@Repository
public class BookDAOImp implements BookDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAOImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Book> findAll() {
        System.out.println("zoooas");
        String sql ="SELECT * FROM book";

        List<Book> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Book.class));
        return result;
    }
}
