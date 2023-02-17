package com.mgv.dnd.v3_5.races.domain.vo;

public final class RaceModifier {
    private final String type;
    private final String modifiedField;
    private final int modifier;

    public RaceModifier(String type, String modifiedField, int modifier){
        this.type = type;
        this.modifiedField = modifiedField;
        this.modifier = modifier;
    }

    public String type() {
        return type;
    }

    public String modifiedField() {
        return modifiedField;
    }

    public int modifier() {
        return modifier;
    }
}
