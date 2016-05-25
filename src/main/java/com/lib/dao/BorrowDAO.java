package com.lib.dao;

import com.lib.domain.Borrow;
import com.lib.domain.Users;
import com.lib.modelview.BorrowModelView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by TR on 3/17/2016.
 */
@Repository
public class BorrowDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BorrowDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(BorrowModelView borrowModelView) {
        String SQL = "insert into borrow (u_id, a_id, c_id, br_borrow_date, br_create_at, br_return_date) values (?, ?, ?, ?, ?,?)";
        Date date = new Date();
        Date returnDate = new Date(date.getTime() + (1000 * 60 * 60 * 24) * 7); //1 week
        return jdbcTemplate.update(SQL, new Object[]{borrowModelView.getUserId(), borrowModelView.getAdminId(),
                borrowModelView.getCopyId(), date, date, returnDate});
    }

    public List<Borrow> findAll() {
        String sql = "select * from borrow";
        List<Borrow> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Borrow.class));
        return result;
    }

    public String getUser(int uID) {
        String sql = "select u_firstname from users where u_id = ?";
        List<Users> result = jdbcTemplate.query(sql, new Object[]{uID}, new BeanPropertyRowMapper(Users.class));
        if (result.size() >= 0) {
            return result.get(0).getUFirstname();
        }
        return null;
    }

    public int updateRid(int rID, int brId){
        String sql = "update borrow set r_id = ? where br_id = ?";
        return jdbcTemplate.update(sql, new Object[]{rID, brId});
    }
}
