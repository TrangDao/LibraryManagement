package com.lib.managebean;

import com.lib.domain.Book;
import com.lib.domain.Borrow;
import com.lib.domain.Copy;
import com.lib.domain.Location;
import com.lib.modelview.SearchBookCriteria;
import com.lib.service.BookService;
import com.lib.service.BorrowService;
import com.lib.service.CopyService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.lib.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by TR on 3/13/2016.
 */

@Component
@ManagedBean
@ViewScoped
public class BooksBean implements Serializable {

    @Autowired
    private BookService bookService;

    @Autowired
    private BorrowService borrowService;

    @Autowired
    private CopyService copyService;

    @Autowired
    private BorrowBean borrowBean;

    @Autowired
    LocationService locationService;

    private Book selectedBook;

    private Copy copy = new Copy();

    private List<Book> filteredBooks;

    private List<Location> locations = new ArrayList<>();
    private Map<Integer, String> mapLocation = new HashMap<>();


    private List<Integer> listLocationId = new ArrayList<>();

    private int selectedLocationId;


    @PostConstruct
    public void init() {
        allBooks = bookService.findAll();
        locations = locationService.getAllLocation();

        mapLocation = new HashMap<>();
        listLocationId = new ArrayList<>();
        for (Location location : locations) {
            mapLocation.put(location.getLId(), location.getLName());
            listLocationId.add(location.getLId());
        }

        selectedLocationId = listLocationId.size() > 0? listLocationId.get(0) : 0;
    }

    public void bookRowOnClick(Book book){

        this.selectedBook = book;
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
        if (!StringUtils.isEmpty(newBook.getBName())) {
            bookService.addNewBook(newBook);
        }
        searchBook();
    }

    public String borrowBook(Book book) {
        borrowBean.setBook(book);
        return "request.xhtml?faces-redirect=true";
    }


    public int createBorrow(Borrow borrow){
        return borrowService.createBorrow(borrow);

    }

    public int addNewCopy(){
        if (copy.getCNumber() <=0 ){
            return 0;
        }
        copy.setlId(selectedLocationId);
        copy.setbId(selectedBook.getBId());
        return copyService.addNewCopy(copy);
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

    public List<Book> getFilteredBooks() {
        return filteredBooks;
    }

    public void setFilteredBooks(List<Book> filteredBooks) {
        this.filteredBooks = filteredBooks;
    }

    public String getLocationName(int id) {
        return mapLocation.get(id);
    }

    public Book getSelectedBook() {
        return selectedBook;
    }

    public void setSelectedBook(Book selectedBook) {
        this.selectedBook = selectedBook;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public int getSelectedLocationId() {
        return selectedLocationId;
    }

    public void setSelectedLocationId(int selectedLocationId) {
        this.selectedLocationId = selectedLocationId;
    }

    public void setNewBook(Book newBook) {
        this.newBook = newBook;
    }

    public List<Integer> getListLocationId() {
        return listLocationId;
    }

    public void setListLocationId(List<Integer> listLocationId) {
        this.listLocationId = listLocationId;
    }
}
