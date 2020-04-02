package com.mastercard.api.entity;

import java.io.Serializable;

public class CountryResp implements Serializable {

    private static final long serialVersionUID = -804561894305436439L;
    private String countryCode;
    private String countryName;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}
