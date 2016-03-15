package com.lib.managebean;

import com.lib.domain.Book;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TR on 3/13/2016.
 */
@ManagedBean
@ViewScoped
public class BooksBean {

    private List<Book> allBooks = new ArrayList<>();



    private Book book = new Book();

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public void submitAddBook() {
        allBooks.add(book);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
