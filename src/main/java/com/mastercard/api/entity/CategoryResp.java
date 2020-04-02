package com.mastercard.api.entity;

import java.io.Serializable;

public class CategoryResp implements Serializable {

    private static final long serialVersionUID = 5047656077331105420L;
    private String categoryId;
    private String categoryName;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
