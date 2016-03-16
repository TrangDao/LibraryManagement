package com.lib.service;

import com.lib.dao.book.BookDAO;
import com.lib.domain.Book;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by lanhnguyen on 14/03/2016.
 */
@Service
public class BookService {

    @Autowired
    private BookDAO bookDAOImp;

    public List<Book> findAll(){
        return bookDAOImp.findAll();
    }
}
