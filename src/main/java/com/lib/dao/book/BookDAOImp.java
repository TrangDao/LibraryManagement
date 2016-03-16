package com.lib.dao.book;

import com.lib.domain.Book;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    @Override
    public int addNewBook(Book newBook) {
        String SQL = "insert into book (b_name, b_author, b_category) values (?, ?, ?)";
       return jdbcTemplate.update( SQL, new Object[]{newBook.getBName(), newBook.getBAuthor(), newBook.getBCategory()});
    }

    @Override
    public List<Book> searchBookByCriteria(Map<String, String> validSearchCriteria) {
        StringBuilder sqlBuilder = new StringBuilder("select * from book where 1=1");
        Set<String> keySet = validSearchCriteria.keySet();
        for (String key : keySet) {
            sqlBuilder.append(" and lower(" + key + ") like lower('%" + validSearchCriteria.get(key) + "%')");
        }

        System.out.println(sqlBuilder.toString());
        List<Book> result = jdbcTemplate.query(sqlBuilder.toString(), new BeanPropertyRowMapper(Book.class));
        return result;
    }
}
