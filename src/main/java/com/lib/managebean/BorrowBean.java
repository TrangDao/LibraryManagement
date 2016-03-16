package com.lib.managebean;

import com.lib.domain.Book;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.springframework.stereotype.Component;

/**
 * Created by lanhnguyen on 16/03/2016.
 */
@ManagedBean
@Component
public class BorrowBean {
    private String cc;

    public String getCc() {
        return shit();
    }

    public String shit() {

        Map<String,String> params =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String book = params.get("book");
        return book;

    }
}
