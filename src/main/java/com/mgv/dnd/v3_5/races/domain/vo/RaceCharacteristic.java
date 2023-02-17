package com.mgv.dnd.v3_5.races.domain.vo;

public final class RaceCharacteristic {
    private final String name;
    private final String description;

    public RaceCharacteristic(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }
}
