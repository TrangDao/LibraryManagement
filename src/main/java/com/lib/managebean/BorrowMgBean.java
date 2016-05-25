package com.lib.managebean;

import com.lib.domain.Book;
import com.lib.domain.Borrow;
import com.lib.domain.Copy;
import com.lib.domain.ReturnBook;
import com.lib.service.BookService;
import com.lib.service.BorrowService;
import com.lib.service.CopyService;
import com.lib.service.ReturnBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.util.Date;
import java.util.List;

/**
 * Created by TR on 3/17/2016.
 */

@Component
@ManagedBean
public class BorrowMgBean {

    @Autowired
    BorrowService borrowService;

    @Autowired
    CopyService copyService;

    @Autowired
    BookService bookService;

    @Autowired
    ReturnBookService returnService;

    private List<Borrow> allBorrows;

    @PostConstruct
    public void init() {
        allBorrows = borrowService.findAll();
        System.out.println(allBorrows.size());
    }

    public List<Borrow> getAllBorrows() {
        allBorrows = borrowService.findAll();
        return allBorrows;
    }

    public void setAllBorrows(List<Borrow> allBorrows) {
        this.allBorrows = allBorrows;
    }

    public Copy getCopy(int copyID) {
        return copyService.getCopyById(copyID);
    }

    public Book getBookById(int bID) {
        return bookService.getById(bID);
    }

    public String getBookName(int cID) {
        return getBookById(getCopy(cID).getbId()).getBName();
    }

    public String getUser(int uID) {
        return borrowService.getUser(uID);

    }

    public boolean isReturned(Integer rID) {
        return (rID != null && rID != 0);
    }

    public void returnBook(Borrow borrow) {
        ReturnBook returnBook = new ReturnBook();
        returnBook.setRReturnDate(new Date());
        returnBook.setRCreateAt(new Date());
        returnBook.setaId(1);
        returnBook.setuId(1);
        returnBook.setBrId(borrow.getBrId());
        returnService.create(returnBook);

    }

    public Date getReturnDate(int rId) {
        ReturnBook returnBook = returnService.getById(rId);
        if (returnBook != null) {
            return returnBook.getRReturnDate();
        }
        return null;

    }

}
