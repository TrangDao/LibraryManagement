package com.lib.dao.copy;

import com.lib.domain.Copy;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * Created by lanhnguyen on 15/03/2016.
 */
@Repository
public interface CopyDAO {

    List<Copy> getCopyByBookID(int ID);
    int countCopyForBook(int bookID);

    Copy getCopyByBookLocation(int bId, int selectedLocationId);

    int numCopyOfLocation(int bId, int selectedLocationId);

    int updateCopyNumber(Copy copy);
}
