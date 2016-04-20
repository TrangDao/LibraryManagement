package com.lib.dao.book;

import com.lib.domain.Book;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

/**
 * Created by lanhnguyen on 14/03/2016.
 */
public interface BookDAO {

    @Transactional
    List<Book> findAll();

    @Transactional
    int countBook(int ID);

    @Transactional
    int addNewBook(Book newBook);

    @Transactional
    List<Book> searchBookByCriteria(Map<String, String> validSearchCriteria);

    @Transactional
    Book getById(int bId);
}
