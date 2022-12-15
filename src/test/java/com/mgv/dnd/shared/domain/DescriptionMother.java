package com.mgv.dnd.shared.domain;

public class DescriptionMother {
    public static String random() {
        return MotherCreator.random().chuckNorris().fact();
    }
}
