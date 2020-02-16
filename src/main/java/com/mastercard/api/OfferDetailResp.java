package com.mastercard.api;

import java.util.List;

public class OfferDetailResp {

    private static final long serialVersionUID = 8197145556122562023L;
    private String offerId;
    private String offerStartDate;
    private String offerEndDate;
    private String offerLastModifiedDate;
    private String offerTitle;
    private String offerSubTitle;
    private String offerDescription;
    private String offerTermsAndConditions;
    private String offerRedemptionCTA;
    private String offerRedemptionInstructions;
    private String offerRedemptionCTAValue;
    private String category;
    private String merchantType;
    private String DTIPermit;
    private List<String> pdfs;

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOfferStartDate() {
        return offerStartDate;
    }

    public void setOfferStartDate(String offerStartDate) {
        this.offerStartDate = offerStartDate;
    }

    public String getOfferEndDate() {
        return offerEndDate;
    }

    public void setOfferEndDate(String offerEndDate) {
        this.offerEndDate = offerEndDate;
    }

    public String getOfferLastModifiedDate() {
        return offerLastModifiedDate;
    }

    public void setOfferLastModifiedDate(String offerLastModifiedDate) {
        this.offerLastModifiedDate = offerLastModifiedDate;
    }

    public String getOfferTitle() {
        return offerTitle;
    }

    public void setOfferTitle(String offerTitle) {
        this.offerTitle = offerTitle;
    }

    public String getOfferSubTitle() {
        return offerSubTitle;
    }

    public void setOfferSubTitle(String offerSubTitle) {
        this.offerSubTitle = offerSubTitle;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getOfferTermsAndConditions() {
        return offerTermsAndConditions;
    }

    public void setOfferTermsAndConditions(String offerTermsAndConditions) {
        this.offerTermsAndConditions = offerTermsAndConditions;
    }

    public String getOfferRedemptionCTA() {
        return offerRedemptionCTA;
    }

    public void setOfferRedemptionCTA(String offerRedemptionCTA) {
        this.offerRedemptionCTA = offerRedemptionCTA;
    }

    public String getOfferRedemptionInstructions() {
        return offerRedemptionInstructions;
    }

    public void setOfferRedemptionInstructions(String offerRedemptionInstructions) {
        this.offerRedemptionInstructions = offerRedemptionInstructions;
    }

    public String getOfferRedemptionCTAValue() {
        return offerRedemptionCTAValue;
    }

    public void setOfferRedemptionCTAValue(String offerRedemptionCTAValue) {
        this.offerRedemptionCTAValue = offerRedemptionCTAValue;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getDTIPermit() {
        return DTIPermit;
    }

    public void setDTIPermit(String DTIPermit) {
        this.DTIPermit = DTIPermit;
    }

    public List<String> getPdfs() {
        return pdfs;
    }

    public void setPdfs(List<String> pdfs) {
        this.pdfs = pdfs;
    }
}
