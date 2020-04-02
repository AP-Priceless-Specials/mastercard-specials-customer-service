package com.mastercard.api.entity;

import java.io.Serializable;

public class LanguageResp implements Serializable {

    private static final long serialVersionUID = -5606340956558218763L;
    private String languageCode;
    private String languageName;

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public LanguageResp(String languageCode, String languageName) {
        this.languageCode = languageCode;
        this.languageName = languageName;
    }
}
