package com.lib.service;

import com.lib.dao.BorrowDAO;
import com.lib.dao.ReturnBookDao;
import com.lib.domain.ReturnBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by TR on 5/25/2016.
 */
@Service
public class ReturnBookService {
    @Autowired
    ReturnBookDao returnBookDao;

    @Autowired
    BorrowDAO borrowDAO;

    @Transactional
    public int create(ReturnBook returnBook) {
        int rId = returnBookDao.create(returnBook);
        borrowDAO.updateRid(rId, returnBook.getBrId());
        return rId;

    }

    public ReturnBook getById(int rId) {
        return returnBookDao.getById(rId);

    }
}
