package com.mgv.dnd.v3_5.abilities.application.create;

import com.mgv.dnd.shared.domain.bus.Command;

public class CreateAbilityCommand extends Command {
    private final String id;
    private final String name;
    private final String description;

    public CreateAbilityCommand(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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
}
