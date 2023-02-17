package com.mgv.dnd.backoffice.api.races.request;

public class RaceLanguageRequest {
    private String language;

    public RaceLanguageRequest(String language) {
        this.language = language;
    }

    public String language() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
