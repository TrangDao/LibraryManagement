package com.lib.dao;

import com.lib.domain.ReturnBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by TR on 5/25/2016.
 */
@Repository
public class ReturnBookDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ReturnBookDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int create(ReturnBook returnBook) {
//        String SQL = "insert into return_book(u_id, br_id, a_id, r_create_at, r_return_date) values (?,?,?,?,?)";
//        Date date = new Date();
//        Date returnDate = new Date(date.getTime() + (1000 * 60 * 60 * 24) * 7); //1 week
//        return jdbcTemplate.update(SQL, new Object[]{returnBook.admin.getAId(), returnBook.bor,
//                borrowModelView.getCopyId(), date, date, returnDate});
        return 0;
    }
}
