package com.lib.dao.copy;

import com.lib.domain.Copy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lanhnguyen on 15/03/2016.
 */
@Repository
public class CopyDAOImp implements CopyDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CopyDAOImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Copy> getCopyByBookID(int ID) {
        String sql = "SELECT * FROM book";
        return null;
    }

    @Override
    public int countCopyForBook(int bookID) {
        String sql = "SELECT sum(c_number) FROM copy WHERE b_id = ?";
        Integer result = jdbcTemplate.queryForObject(sql, Integer.class, bookID);
        if (result != null) {
            return result;
        } else {
            return 0;
        }
    }

    @Override
    public Copy getCopyByBookLocation(int bId, int selectedLocationId) {
        String sql = "Select * from copy where b_id=? and l_id=? limit 1";
        List<Copy> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Copy.class), bId, selectedLocationId);
        if (result.size() > 0) {
            return result.get(0);
        }
        return new Copy();
    }

    @Override
    public int numCopyOfLocation(int bId, int selectedLocationId) {
        String sql = "SELECT sum(c_number) FROM copy WHERE b_id=? and l_id =?";
        Integer result = jdbcTemplate.queryForObject(sql, Integer.class, bId,  selectedLocationId);
        if (result != null) {
            return result;
        }
        return 0;

    }

    @Override
    public int updateCopyNumber(Copy copy) {
        String sql = "update copy set c_number=? where c_id=?";
        System.out.println(sql);
        return jdbcTemplate.update(sql, new Object[]{copy.cNumber, copy.cId});
    }

    @Override
    public Copy getById(int cId) {
        String sql = "Select * from copy where c_id = ?";
        List<Copy> result = jdbcTemplate.query(sql, new Object[]{cId}, new BeanPropertyRowMapper(Copy.class));
        if (result.size() >= 0) {
            return result.get(0);
        }
        return null;
    }
}
