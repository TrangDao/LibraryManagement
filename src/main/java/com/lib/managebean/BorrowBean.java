package com.lib.managebean;

import com.lib.domain.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.lib.domain.Borrow;
import com.lib.domain.Copy;
import com.lib.domain.Location;
import com.lib.modelview.BorrowModelView;
import com.lib.service.BorrowService;
import com.lib.service.CopyService;
import com.lib.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lanhnguyen on 16/03/2016.
 */
@ManagedBean
@Component
public class BorrowBean {

    @Autowired
    CopyService copyService;

    @Autowired
    LocationService locationService;

    @Autowired
    BorrowService borrowService;

    @PostConstruct
    public void init() {
        book = new Book();
        allBorrow = borrowService.findAll();
    }

    private boolean isError = false;

    private int selectedLocationId;
    private Book book;
    // private Copy copy = new Copy();
    private List<Location> locations = new ArrayList<>();
    private Map<Integer, String> mapLocation = new HashMap<>();

    private List<Borrow> allBorrow = new ArrayList<>();

    public List<Integer> getListLocationId() {
        return listLocationId;
    }

    public void setListLocationId(List<Integer> listLocationId) {
        this.listLocationId = listLocationId;
    }

    private List<Integer> listLocationId = new ArrayList<>();


    /**
     * Onlick action
     */


    public void setBook(Book book) {
        this.book = book;
        locations = locationService.getLocationByBookId(book.bId);

        mapLocation = new HashMap<>();
        listLocationId = new ArrayList<>();
        for (Location location : locations) {
            mapLocation.put(location.getLId(), location.getLName());
            listLocationId.add(location.getLId());
        }

        selectedLocationId = listLocationId.size() > 0? listLocationId.get(0) : 0;
        copy = copyService.getCopyFromBookLocation(book.bId, selectedLocationId);
        countCopiesOfLocation = copy.cNumber;
    }

    public String getLocationName(int id) {
        return mapLocation.get(id);
    }

    public Book getBook() {
        return book;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public int getSelectedLocationId() {
        return selectedLocationId;
    }

    public void setSelectedLocationId(int selectedLocationId) {
        this.selectedLocationId = selectedLocationId;
    }

    private Copy copy = new Copy();

    public void onLocationChange() {

        copy = copyService.getCopyFromBookLocation(book.bId, selectedLocationId);
        System.out.println(copy.getCId());
    }

    private int countCopiesOfLocation;
    public int getCountCopiesOfLocation() {
        return copyService.numCopyOfLocation(book.bId, selectedLocationId);
    }

    public boolean isAvailableForSubmit(){
        System.out.println("number " + copy.cNumber);
        return (copy.cNumber >0);
    }

    public void requestBorrow() {
        if (copy.cNumber <=0) {
            isError = true;
            return;
        }
        BorrowModelView borrowModelView = new BorrowModelView();
        borrowModelView.setUserId(1);
        borrowModelView.setAdminId(1);
        borrowModelView.setCopyId(copy.cId);

        int result = borrowService.save(borrowModelView);
        if (result == 1) {
            copy.cNumber -= 1;
            copyService.updateCopyNumber(copy);
            isError = false;
            return;
        }

        allBorrow = borrowService.findAll();

        isError = true;
    }

    public boolean getIsError() {
        return isError;
    }

    public void setIsError(boolean error) {
        isError = error;
    }

    public List<Borrow> getAllBorrow() {
        return allBorrow;
    }

    public void setAllBorrow(List<Borrow> allBorrow) {
        this.allBorrow = allBorrow;
    }
}
