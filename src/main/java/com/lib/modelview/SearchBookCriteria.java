package com.lib.modelview;

/**
 * Created by TR on 3/16/2016.
 */
public class SearchBookCriteria {
    private String name = "";
    private String author = "";
    private String category = "";

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
