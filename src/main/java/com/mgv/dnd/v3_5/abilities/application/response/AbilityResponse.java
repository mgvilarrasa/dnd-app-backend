package com.mgv.dnd.v3_5.abilities.application.response;

import com.mgv.dnd.shared.domain.bus.Response;
import com.mgv.dnd.v3_5.abilities.domain.Ability;

public class AbilityResponse implements Response {
    private final String id;
    private final String name;
    private final String description;

    public AbilityResponse(String id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static AbilityResponse fromAggregate(Ability ability){
        return new AbilityResponse(ability.id().value(), ability.name().value(), ability.description().value());
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
