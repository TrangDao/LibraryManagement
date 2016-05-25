package com.lib.managebean;

import com.lib.domain.*;
import com.lib.modelview.BorrowModelView;
import com.lib.service.BorrowService;
import com.lib.service.CopyService;
import com.lib.service.LocationService;
import com.lib.service.UserService;
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

    @Autowired
    UserService userService;

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

    private List<Integer> listUserId = new ArrayList<>();
    private List<Users> usersList = new ArrayList<>();
    private Map<Integer, String> mapUsers = new HashMap<>();
    private int selectedUserId;

    @PostConstruct
    public void init() {
        book = new Book();
        //allBorrow = borrowService.findAll();
        // onLoadData();

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

    public String getUserName(int id) {
        return mapUsers.get(id);
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

        usersList = userService.loadAll();
        mapUsers = new HashMap<>();
        listUserId = new ArrayList<>();
        for (Users user : usersList) {
            mapUsers.put(user.getUId(), user.getUFirstname());
            listUserId.add(user.getUId());
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
        borrowModelView.setUserId(selectedUserId);
        borrowModelView.setAdminId(1);
        borrowModelView.setCopyId(copy.cId);

        int result = borrowService.save(borrowModelView);
        allBorrow = borrowService.findAll();
        if (result == 1) {
            copy.cNumber -= 1;
            copyService.updateCopyNumber(copy);

            RequestContext.getCurrentInstance().execute("PF('bookDialog').show();");
            return;
        }

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

    public int getSelectedUserId() {
        return selectedUserId;
    }

    public void setSelectedUserId(int selectedUserId) {
        this.selectedUserId = selectedUserId;
    }

    public List<Integer> getListUserId() {
        return listUserId;
    }

    public void setListUserId(List<Integer> listUserId) {
        this.listUserId = listUserId;
    }
}
