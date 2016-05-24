package com.lib.managebean;

import com.lib.domain.Book;
import com.lib.domain.Borrow;
import com.lib.domain.Copy;
import com.lib.domain.Location;
import com.lib.modelview.BorrowModelView;
import com.lib.service.BorrowService;
import com.lib.service.CopyService;
import com.lib.service.LocationService;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private boolean isError = false;
    private int selectedLocationId;
    private Book book;
    // private Copy copy = new Copy();
    private List<Location> locations = new ArrayList<>();
    private Map<Integer, String> mapLocation = new HashMap<>();
    private List<Borrow> allBorrow = new ArrayList<>();
    private List<Integer> listLocationId = new ArrayList<>();
    private Copy copy = new Copy();
    private int countCopiesOfLocation;

    @PostConstruct
    public void init() {
        book = new Book();
        allBorrow = borrowService.findAll();
    }

    public List<Integer> getListLocationId() {
        return listLocationId;
    }

    public void setListLocationId(List<Integer> listLocationId) {
        this.listLocationId = listLocationId;
    }

    public String getLocationName(int id) {
        return mapLocation.get(id);
    }

    public Book getBook() {
        return book;
    }

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

    public List<Location> getLocations() {
        return locations;
    }

    public int getSelectedLocationId() {
        return selectedLocationId;
    }

    public void setSelectedLocationId(int selectedLocationId) {
        this.selectedLocationId = selectedLocationId;
    }

    public void onLocationChange() {
        copy = copyService.getCopyFromBookLocation(book.bId, selectedLocationId);
        System.out.println(copy.getCId());
    }

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
            RequestContext.getCurrentInstance().execute("PF('errorDialog').show();");
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
            RequestContext.getCurrentInstance().execute("PF('bookDialog').show();");
            return;
        }

        allBorrow = borrowService.findAll();

        isError = true;
        RequestContext.getCurrentInstance().execute("PF('errorDialog').show();");
        return;
    }

    public String redirectPage() {
        return "borrow.xhtml?faces-redirect=true";
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
