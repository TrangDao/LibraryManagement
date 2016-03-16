package com.lib.service;

import com.lib.dao.copy.CopyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lanhnguyen on 15/03/2016.
 */
@Service
public class CopyService {

    @Autowired
    private CopyDAO copyDAO;

    public int sumCopyForBook(int bookID){
        return copyDAO.countCopyForBook(bookID);
    }
}
