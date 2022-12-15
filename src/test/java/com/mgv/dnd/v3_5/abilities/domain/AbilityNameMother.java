package com.mgv.dnd.v3_5.abilities.domain;

import com.mgv.dnd.shared.domain.NameMother;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityName;

public class AbilityNameMother {
    public static AbilityName create(String value) {
        return new AbilityName(value);
    }
    public static AbilityName random() {
        return create(NameMother.random());
    }
}
