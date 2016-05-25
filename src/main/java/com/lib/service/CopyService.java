package com.lib.service;

import com.lib.dao.copy.CopyDAO;
import com.lib.domain.Copy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lanhnguyen on 15/03/2016.
 */
@Service
public class CopyService {

    @Autowired
    private CopyDAO copyDAO;

    public int sumCopyForBook(int bookID) {
        return copyDAO.countCopyForBook(bookID);
    }

    public Copy getCopyFromBookLocation(int bId, int selectedLocationId) {
        return copyDAO.getCopyByBookLocation(bId, selectedLocationId);
    }

    public int numCopyOfLocation(int bId, int selectedLocationId) {
        return copyDAO.numCopyOfLocation(bId, selectedLocationId);
    }

    public int updateCopyNumber(Copy copy) {
        return copyDAO.updateCopyNumber(copy);
    }

    public Copy getCopyById(int cId) {
        return copyDAO.getById(cId);
    }

    public int addNewCopy(Copy copy) {
        return copyDAO.addNewCopy(copy);
    }
}
