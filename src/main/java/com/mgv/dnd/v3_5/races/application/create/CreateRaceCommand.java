package com.mgv.dnd.v3_5.races.application.create;

import com.mgv.dnd.backoffice.api.races.request.RaceCharacteristicRequest;
import com.mgv.dnd.backoffice.api.races.request.RaceLanguageRequest;
import com.mgv.dnd.backoffice.api.races.request.RaceModifierRequest;
import com.mgv.dnd.shared.domain.bus.Command;

import java.util.List;

public final class CreateRaceCommand extends Command {
    private final String id;
    private final String name;
    private final String description;
    private final String size;
    private final String speed;
    private final List<RaceLanguageRequest> languages;
    private final List<RaceCharacteristicRequest> characteristics;
    private final List<RaceModifierRequest> modifiers;

    public CreateRaceCommand(String id, String name, String description, String size, String speed,
                             List<RaceLanguageRequest> languages, List<RaceCharacteristicRequest> characteristics, List<RaceModifierRequest> modifiers) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
        this.speed = speed;
        this.languages = languages;
        this.characteristics = characteristics;
        this.modifiers = modifiers;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    public String size() {
        return size;
    }

    public String speed() {
        return speed;
    }

    public List<RaceLanguageRequest> languages() {
        return languages;
    }

    public List<RaceCharacteristicRequest> characteristics() {
        return characteristics;
    }

    public List<RaceModifierRequest> modifiers() {
        return modifiers;
    }
}
