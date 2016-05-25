package com.lib.service;

import com.lib.dao.ReturnBookDao;
import com.lib.domain.ReturnBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by TR on 5/25/2016.
 */
@Service
public class ReturnBookService {
    @Autowired
    ReturnBookDao returnBookDao;

    public int create(ReturnBook returnBook) {
        return returnBookDao.create(returnBook);
    }
}
