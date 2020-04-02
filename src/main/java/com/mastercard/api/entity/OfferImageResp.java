package com.mastercard.api.entity;

public class OfferImageResp {

    private static final long serialVersionUID = 8755482765696465557L;
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
