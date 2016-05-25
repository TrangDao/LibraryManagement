package com.lib.dao.copy;

import com.lib.domain.Copy;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lanhnguyen on 15/03/2016.
 */
@Repository
public interface CopyDAO {

    @Transactional
    List<Copy> getCopyByBookID(int ID);
    int countCopyForBook(int bookID);

    @Transactional
    Copy getCopyByBookLocation(int bId, int selectedLocationId);

    @Transactional
    int numCopyOfLocation(int bId, int selectedLocationId);

    @Transactional
    int updateCopyNumber(Copy copy);

    @Transactional
    Copy getById(int cId);

    @Transactional
    int addNewCopy(Copy copy);
}
