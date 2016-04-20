package com.lib.dao.location;

import com.lib.domain.Location;

import java.util.List;

/**
 * Created by TR on 3/16/2016.
 */
public interface LocationDao {
    List<Location> getAllLocation();

    List<Location> getLocationByBookId(int bId);
}
