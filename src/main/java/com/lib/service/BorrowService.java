package com.lib.service;

import com.lib.dao.BorrowDAO;
import com.lib.domain.Borrow;
import com.lib.modelview.BorrowModelView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lanhnguyen on 14/03/2016.
 */
@Service
public class BorrowService {

    @Autowired
    BorrowDAO borrowDao;

    public int createBorrow(Borrow borrow){
        return 0;
    }

    public int save(BorrowModelView borrowModelView) {
        return borrowDao.save(borrowModelView);
    }

    public List<Borrow> findAll() {
        return borrowDao.findAll();
    }
}
