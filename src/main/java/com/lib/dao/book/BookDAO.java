package com.lib.dao.book;

import com.lib.domain.Book;
import java.util.List;

/**
 * Created by lanhnguyen on 14/03/2016.
 */
public interface BookDAO {

    List<Book> findAll();

    int countBook(int ID);
}
