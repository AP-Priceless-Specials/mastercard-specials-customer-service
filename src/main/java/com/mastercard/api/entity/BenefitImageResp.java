package com.mastercard.api.entity;

import java.io.Serializable;

public class BenefitImageResp implements Serializable {

    private static final long serialVersionUID = -6418540611375309234L;

    private String rectangleImage;

    private String squareImage;

    public String getRectangleImage() {
        return rectangleImage;
    }

    public void setRectangleImage(String rectangleImage) {
        this.rectangleImage = rectangleImage;
    }

    public String getSquareImage() {
        return squareImage;
    }

    public void setSquareImage(String squareImage) {
        this.squareImage = squareImage;
    }
}
