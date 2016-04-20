package com.lib.dao.location;

import com.lib.domain.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TR on 3/16/2016.
 */
@Repository
public class LocationDaoImpl implements LocationDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public LocationDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Location> getAllLocation() {
        String sql = "SELECT * FROM location";
        List<Location> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Location.class));
        return result;
    }

    @Override
    public List<Location> getLocationByBookId(int bId) {
        //String sql = "select * from location where location.l_id in (select copy.l_id from copy where copy.b_id=" + bId +")";
        String sql = "SELECT * FROM location JOIN copy ON location.l_id = copy.l_id and b_id = ? AND copy.c_number > 0";
        List<Location> result = jdbcTemplate.query(sql, new Object[]{bId}, new BeanPropertyRowMapper(Location.class));
        return result;
    }
}
