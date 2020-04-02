package com.mastercard.api.entity;

import java.io.Serializable;
import java.util.List;

public class BenefitDetailResp implements Serializable {

    private static final long serialVersionUID = -1361522633192029524L;

    private String benefitId;

    private String benefitStartDate;

    private String benefitEndDate;

    private String benefitLastModifiedDate;

    private String benefitTitle;

    private String benefitSubTitle;

    private String benefitDescription;

    private String benefitTermsAndConditions;

    private String benefitRedemptionCTA;

    private String benefitRedemptionInstructions;

    private String benefitRedemptionCTAValue;

    private String category;
    
    private List<String> pdfs;

    private boolean isOnline;

    private String dtiPermit;

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getDtiPermit() {
        return dtiPermit;
    }

    public void setDtiPermit(String dtiPermit) {
        this.dtiPermit = dtiPermit;
    }

    public String getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(String benefitId) {
        this.benefitId = benefitId;
    }

    public String getBenefitStartDate() {
        return benefitStartDate;
    }

    public void setBenefitStartDate(String benefitStartDate) {
        this.benefitStartDate = benefitStartDate;
    }

    public String getBenefitEndDate() {
        return benefitEndDate;
    }

    public void setBenefitEndDate(String benefitEndDate) {
        this.benefitEndDate = benefitEndDate;
    }

    public String getBenefitLastModifiedDate() {
        return benefitLastModifiedDate;
    }

    public void setBenefitLastModifiedDate(String benefitLastModifiedDate) {
        this.benefitLastModifiedDate = benefitLastModifiedDate;
    }

    public String getBenefitTitle() {
        return benefitTitle;
    }

    public void setBenefitTitle(String benefitTitle) {
        this.benefitTitle = benefitTitle;
    }

    public String getBenefitSubTitle() {
        return benefitSubTitle;
    }

    public void setBenefitSubTitle(String benefitSubTitle) {
        this.benefitSubTitle = benefitSubTitle;
    }

    public String getBenefitDescription() {
        return benefitDescription;
    }

    public void setBenefitDescription(String benefitDescription) {
        this.benefitDescription = benefitDescription;
    }

    public String getBenefitTermsAndConditions() {
        return benefitTermsAndConditions;
    }

    public void setBenefitTermsAndConditions(String benefitTermsAndConditions) {
        this.benefitTermsAndConditions = benefitTermsAndConditions;
    }

    public String getBenefitRedemptionCTA() {
        return benefitRedemptionCTA;
    }

    public void setBenefitRedemptionCTA(String benefitRedemptionCTA) {
        this.benefitRedemptionCTA = benefitRedemptionCTA;
    }

    public String getBenefitRedemptionInstructions() {
        return benefitRedemptionInstructions;
    }

    public void setBenefitRedemptionInstructions(String benefitRedemptionInstructions) {
        this.benefitRedemptionInstructions = benefitRedemptionInstructions;
    }

    public String getBenefitRedemptionCTAValue() {
        return benefitRedemptionCTAValue;
    }

    public void setBenefitRedemptionCTAValue(String benefitRedemptionCTAValue) {
        this.benefitRedemptionCTAValue = benefitRedemptionCTAValue;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(boolean online) {
        isOnline = online;
    }
    public List<String> getPdfs() {
		return pdfs;
	}

	public void setPdfs(List<String> pdfs) {
		this.pdfs = pdfs;
	}
}
