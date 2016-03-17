package com.lib.managebean;

import com.lib.domain.Book;
import com.lib.domain.Borrow;
import com.lib.modelview.SearchBookCriteria;
import com.lib.service.BookService;
import com.lib.service.BorrowService;
import com.lib.service.CopyService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

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

    @Autowired
    private CopyService copyService;

    @Autowired
    private BorrowBean borrowBean;

    @PostConstruct
    public void init() {
        allBooks = bookService.findAll();
       // searchBookCriteria.setName("b");
    }
    private Book newBook = new Book();

    private Borrow borrow = new Borrow();

    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Borrow getBorrow() {
        return borrow;
    }

    public void setBorrow(Borrow borrow) {
        this.borrow = borrow;
    }

    private List<Book> allBooks = new ArrayList<>();

    private SearchBookCriteria searchBookCriteria = new SearchBookCriteria();


//    public List<Book> getAllBooks() {
//        return bookService.findAll();
//    }

    public int countCopy(int bookID){
        return copyService.sumCopyForBook(bookID);
    }

    public boolean isAvailable(int bookID){
        return  (copyService.sumCopyForBook(bookID) > 0);
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public BookService getBookService() {
        return bookService;
    }

    public void addNewBook() {
        System.out.println("add");
        System.out.println(bookService.addNewBook(newBook));
    }

    public String borrowBook(Book book) {
        borrowBean.setBook(book);
        return "request.xhtml?faces-redirect=true";
    }


    public int createBorrow(Borrow borrow){
        return borrowService.createBorrow(borrow);

    }

    public Book getNewBook() {
        return newBook;
    }

    public SearchBookCriteria getSearchBookCriteria() {
        return searchBookCriteria;
    }

    public void setSearchBookCriteria(SearchBookCriteria searchBookCriteria) {
        this.searchBookCriteria = searchBookCriteria;
    }

    public void searchBook() {
        allBooks = bookService.searchByCriteria(searchBookCriteria);
    }

    public List<Book> getAllBooks() {
        return allBooks;
    }
}
