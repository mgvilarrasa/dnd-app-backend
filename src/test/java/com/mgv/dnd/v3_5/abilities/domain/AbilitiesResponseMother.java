package com.mgv.dnd.v3_5.abilities.domain;

import com.mgv.dnd.v3_5.abilities.application.response.AbilitiesResponse;
import com.mgv.dnd.v3_5.abilities.application.response.AbilityResponse;

import java.util.ArrayList;
import java.util.List;

public class AbilitiesResponseMother {
    public static AbilitiesResponse random(int listSize){
        List<AbilityResponse> abilities = new ArrayList<>();
        for(int i=0; i<listSize; i++){
            abilities.add(AbilityResponseMother.random());
        }
        return new AbilitiesResponse(abilities);
    }
}
