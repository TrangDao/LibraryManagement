package com.lib.service;

import com.lib.dao.location.LocationDao;
import com.lib.domain.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TR on 3/16/2016.
 */
@Service
public class LocationService {

    @Autowired
    LocationDao locationDao;

    public List<Location> getAllLocation() {
        return locationDao.getAllLocation();
    }

    public List<Location> getLocationByBookId(int bId) {
        return locationDao.getLocationByBookId(bId);
    }
}
