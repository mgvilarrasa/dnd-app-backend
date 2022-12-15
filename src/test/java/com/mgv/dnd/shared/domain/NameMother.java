package com.mgv.dnd.shared.domain;

public class NameMother {
    public static String random() {
        return MotherCreator.random().funnyName().name();
    }
}
