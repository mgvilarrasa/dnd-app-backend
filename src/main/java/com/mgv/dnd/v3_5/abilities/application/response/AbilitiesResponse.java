package com.mgv.dnd.v3_5.abilities.application.response;

import com.mgv.dnd.shared.domain.bus.Response;

import java.util.List;

public class AbilitiesResponse implements Response {
    private final List<AbilityResponse> abilities;

    public AbilitiesResponse(List<AbilityResponse> abilities) {
        this.abilities = abilities;
    }

    public List<AbilityResponse> abilities() {
        return abilities;
    }
}
