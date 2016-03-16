package com.lib.dao.book;

import com.lib.domain.Book;
import java.util.List;
import java.util.Map;

/**
 * Created by lanhnguyen on 14/03/2016.
 */
public interface BookDAO {

    List<Book> findAll();

    int countBook(int ID);

    int addNewBook(Book newBook);

    List<Book> searchBookByCriteria(Map<String, String> validSearchCriteria);
}
