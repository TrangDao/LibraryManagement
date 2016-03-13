package com.lib.ManageBean;

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

    private List<String> allBooks = new ArrayList<>();


    public List<String> getAllBooks() {
        return allBooks;
    }
}
