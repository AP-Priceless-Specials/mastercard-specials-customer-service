package com.mastercard.api;

import java.util.List;

public class MerchantResp {

    private static final long serialVersionUID = -6514978663935596620L;
    private String merchantName;
    private String merchantLogo;
    private String merchantEmailAddress;
    private String merchantPhoneNumber;
    private String merchantCity;
    private String merchantCountryCode;
    private String merchantCountry;
    private String merchantWebsite;
    //    private String coordinates;
    private List<MerchantLocationMO> merchantLocations;

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantLogo() {
        return merchantLogo;
    }

    public void setMerchantLogo(String merchantLogo) {
        this.merchantLogo = merchantLogo;
    }

    public String getMerchantEmailAddress() {
        return merchantEmailAddress;
    }

    public void setMerchantEmailAddress(String merchantEmailAddress) {
        this.merchantEmailAddress = merchantEmailAddress;
    }

    public String getMerchantPhoneNumber() {
        return merchantPhoneNumber;
    }

    public void setMerchantPhoneNumber(String merchantPhoneNumber) {
        this.merchantPhoneNumber = merchantPhoneNumber;
    }

    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    public String getMerchantCountryCode() {
        return merchantCountryCode;
    }

    public void setMerchantCountryCode(String merchantCountryCode) {
        this.merchantCountryCode = merchantCountryCode;
    }

    public String getMerchantCountry() {
        return merchantCountry;
    }

    public void setMerchantCountry(String merchantCountry) {
        this.merchantCountry = merchantCountry;
    }

    public String getMerchantWebsite() {
        return merchantWebsite;
    }

    public void setMerchantWebsite(String merchantWebsite) {
        this.merchantWebsite = merchantWebsite;
    }

    public List<MerchantLocationMO> getMerchantLocations() {
        return merchantLocations;
    }

    public void setMerchantLocations(List<MerchantLocationMO> merchantLocations) {
        this.merchantLocations = merchantLocations;
    }
}
