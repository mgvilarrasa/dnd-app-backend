package com.mgv.dnd.shared.domain;

import net.datafaker.Faker;

public class MotherCreator {
    private final static Faker faker = new Faker();

    public static Faker random() {
        return faker;
    }
}
