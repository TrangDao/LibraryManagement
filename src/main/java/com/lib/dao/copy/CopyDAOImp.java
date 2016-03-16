package com.lib.dao.copy;

import com.lib.domain.Copy;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
        String sql ="SELECT * FROM book";
        return null;
    }

    @Override
    public int countCopyForBook(int bookID) {
        String sql = "SELECT sum(c_number) FROM copy WHERE b_id = ?";
        Integer result = jdbcTemplate.queryForObject(sql, Integer.class, bookID);
        if (result != null){
            return result;
        } else {
            return 0;
        }



    }
}
