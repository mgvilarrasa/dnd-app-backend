package com.mgv.dnd.shared.domain;

public class WordMother {
    public static String random() {
        return MotherCreator.random().lorem().word();
    }
}
