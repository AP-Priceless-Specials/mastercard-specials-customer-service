package com.mastercard.api.entity;

import java.io.Serializable;
import java.util.List;

public class BenefitResp implements Serializable {

    private static final long serialVersionUID = -6732456613260382733L;

    private String language;

    private BenefitDetailResp benefitDetails;

    private List<String> eligibleMastercardProducts;

    private List<String> eligibleMarkets;

    private List<String> destinationMarkets;

    private MerchantResp merchantDetails;

    private BenefitImageResp benefitImages;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public BenefitDetailResp getBenefitDetails() {
        return benefitDetails;
    }

    public void setBenefitDetails(BenefitDetailResp benefitDetails) {
        this.benefitDetails = benefitDetails;
    }

    public List<String> getEligibleMastercardProducts() {
        return eligibleMastercardProducts;
    }

    public void setEligibleMastercardProducts(List<String> eligibleMastercardProducts) {
        this.eligibleMastercardProducts = eligibleMastercardProducts;
    }

    public List<String> getEligibleMarkets() {
        return eligibleMarkets;
    }

    public void setEligibleMarkets(List<String> eligibleMarkets) {
        this.eligibleMarkets = eligibleMarkets;
    }

    public List<String> getDestinationMarkets() {
        return destinationMarkets;
    }

    public void setDestinationMarkets(List<String> destinationMarkets) {
        this.destinationMarkets = destinationMarkets;
    }

    public MerchantResp getMerchantDetails() {
        return merchantDetails;
    }

    public void setMerchantDetails(MerchantResp merchantDetails) {
        this.merchantDetails = merchantDetails;
    }

    public BenefitImageResp getBenefitImages() {
        return benefitImages;
    }

    public void setBenefitImages(BenefitImageResp benefitImages) {
        this.benefitImages = benefitImages;
    }
}
