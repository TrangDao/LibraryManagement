package com.lib.managebean;

import com.lib.domain.Location;
import com.lib.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by TR on 3/16/2016.
 */
@ManagedBean
public class LocationBean {
    @Autowired
    LocationService locationService;

    //private List<Location> allLocation = new ArrayList<>();

    public List<Location> getAllLocation() {
        return locationService.getAllLocation();
    }
}
