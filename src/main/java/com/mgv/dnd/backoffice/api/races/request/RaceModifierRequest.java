package com.mgv.dnd.backoffice.api.races.request;

public class RaceModifierRequest {
    private String type;
    private String modifiedField;
    private int modifier;

    public RaceModifierRequest(String type, String modifiedField, int modifier) {
        this.type = type;
        this.modifiedField = modifiedField;
        this.modifier = modifier;
    }

    public String type() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String modifiedField() {
        return modifiedField;
    }

    public void setModifiedField(String modifiedField) {
        this.modifiedField = modifiedField;
    }

    public int modifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }
}
