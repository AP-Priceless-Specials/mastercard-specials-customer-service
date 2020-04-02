package com.mastercard.api.entity;

import java.io.Serializable;

public class MastercardProductResp implements Serializable {

    private static final long serialVersionUID = -36318950258228395L;
    private String mastercardProductCode;
    private String mastercardProductName;
    private String productType;

    public String getMastercardProductCode() {
        return mastercardProductCode;
    }

    public void setMastercardProductCode(String mastercardProductCode) {
        this.mastercardProductCode = mastercardProductCode;
    }

    public String getMastercardProductName() {
        return mastercardProductName;
    }

    public void setMastercardProductName(String mastercardProductName) {
        this.mastercardProductName = mastercardProductName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

}
