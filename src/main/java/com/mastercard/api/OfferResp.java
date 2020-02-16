package com.mastercard.api;

import java.util.List;

public class OfferResp {

    private static final long serialVersionUID = 1516099002591093501L;
    private String language;

    private OfferDetailResp offerDetails;

    private List<String> eligibleMastercardProducts;

    private List<String> eligibleMarkets;

    private List<String> destinationMarkets;

    private MerchantResp merchantDetails;

    private OfferImageResp offerImages;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public OfferDetailResp getOfferDetails() {
        return offerDetails;
    }

    public void setOfferDetails(OfferDetailResp offerDetails) {
        this.offerDetails = offerDetails;
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

    public OfferImageResp getOfferImages() {
        return offerImages;
    }

    public void setOfferImages(OfferImageResp offerImages) {
        this.offerImages = offerImages;
    }
}
