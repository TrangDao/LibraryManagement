package com.lib.dao.book;

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
        String sql ="SELECT * FROM book";
        List<Book> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Book.class));
        return result;
    }

    @Override
    public int countBook(int ID) {

        String sql = "SELECT count(copy.c_number) FROM book JOIN copy ON book.b_id = copy.b_id";
        return 0;
    }
}
