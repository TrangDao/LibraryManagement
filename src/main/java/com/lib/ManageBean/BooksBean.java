package com.lib.managebean;

import com.lib.service.BookService;
import com.lib.service.BorrowService;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by TR on 3/13/2016.
 */
@Component
@ManagedBean
public class BooksBean {

    @Autowired
    private BookService bookService;

    @Autowired
    private BorrowService borrowService;

    private Borrow borrow = new Borrow();

    public Borrow getBorrow() {
        return borrow;
    }

    public void setBorrow(Borrow borrow) {
        this.borrow = borrow;
    }

    private List<String> allBooks = new ArrayList<>();


    public List<String> getAllBooks() {
        return allBooks;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public BookService getBookService() {
        return bookService;
    }

    public void cc(){
        bookService.findAll();
    }

    public int createBorrow(Borrow borrow){
        return borrowService.createBorrow(borrow);

    }
}
