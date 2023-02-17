package com.mgv.dnd.backoffice.api.races.request;

public class RaceCharacteristicRequest {
    private String name;
    private String description;

    public RaceCharacteristicRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String description() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
