package com.lib.service;

import com.lib.dao.book.BookDAO;
import com.lib.domain.Book;
import com.lib.modelview.SearchBookCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by lanhnguyen on 14/03/2016.
 */
@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public List<Book> findAll(){
        return bookDAO.findAll();
    }

    public int addNewBook(Book newBook) {
        return bookDAO.addNewBook(newBook);
    }

    public List<Book> searchByCriteria(SearchBookCriteria searchBookCriteria) {
        Map<String,String> validSearchCriteria = new HashMap<>();
        if (!StringUtils.isEmpty(searchBookCriteria.getName())) {
            validSearchCriteria.put("b_name", searchBookCriteria.getName().trim());
        }

        if (!StringUtils.isEmpty(searchBookCriteria.getName())) {
            validSearchCriteria.put("b_author", searchBookCriteria.getAuthor().trim());
        }

        if (!StringUtils.isEmpty(searchBookCriteria.getName())) {
            validSearchCriteria.put("b_category", searchBookCriteria.getCategory().trim());
        }

        return bookDAO.searchBookByCriteria(validSearchCriteria);
    }

    public Book getById(int bId) {
        return bookDAO.getById(bId);
    }
}
