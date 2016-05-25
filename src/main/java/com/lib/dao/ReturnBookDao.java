package com.lib.dao;

import com.lib.domain.ReturnBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

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

    public int create(final ReturnBook returnBook) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        final String sql = "insert into return_book(u_id, br_id, a_id, r_create_at, r_return_date) values (?,?,?,?,?)";
        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement pst =
                        con.prepareStatement(sql, new String[]{"r_id"});
                pst.setInt(1, returnBook.getuId());
                pst.setInt(2, returnBook.getBrId());
                pst.setInt(3, returnBook.getaId());
                pst.setDate(4, new Date(returnBook.getrCreateAt().getTime()));
                pst.setDate(5, new Date(returnBook.getrReturnDate().getTime()));
                return pst;
            }
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }

    public ReturnBook getById(int rId) {
        String sql = "select * from return_book where r_id = ?";
        List<ReturnBook> result = jdbcTemplate.query(sql, new Object[]{rId}, new BeanPropertyRowMapper(ReturnBook.class));
        if (result.size() > 0) {
            return result.get(0);
        }
        return null;
    }
}
