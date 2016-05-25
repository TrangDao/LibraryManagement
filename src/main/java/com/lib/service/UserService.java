package com.lib.service;

import com.lib.dao.UserDAO;
import com.lib.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by TR on 5/25/2016.
 */
@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    @Transactional
    public List<Users> loadAll() {
        return userDAO.loadAll();
    }
}
