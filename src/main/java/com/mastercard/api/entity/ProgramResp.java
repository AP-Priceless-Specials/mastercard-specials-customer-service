package com.mastercard.api.entity;

import java.io.Serializable;
import java.util.List;

public class ProgramResp implements Serializable {

    private static final long serialVersionUID = -8466916753677447915L;
    private String programId;
    private String programTitle;
    private String programDescription;
    private List<String> eligibleMastercardProducts;
    private String programStartDate;
    private String programEndDate;

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getProgramTitle() {
        return programTitle;
    }

    public void setProgramTitle(String programTitle) {
        this.programTitle = programTitle;
    }

    public String getProgramDescription() {
        return programDescription;
    }

    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription;
    }

    public List<String> getEligibleMastercardProducts() {
        return eligibleMastercardProducts;
    }

    public void setEligibleMastercardProducts(List<String> eligibleMastercardProducts) {
        this.eligibleMastercardProducts = eligibleMastercardProducts;
    }

    public String getProgramStartDate() {
        return programStartDate;
    }

    public void setProgramStartDate(String programStartDate) {
        this.programStartDate = programStartDate;
    }

    public String getProgramEndDate() {
        return programEndDate;
    }

    public void setProgramEndDate(String programEndDate) {
        this.programEndDate = programEndDate;
    }
}
