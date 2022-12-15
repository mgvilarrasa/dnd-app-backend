package com.mgv.dnd.v3_5.abilities.domain;

import com.mgv.dnd.shared.domain.UuidMother;
import com.mgv.dnd.v3_5.abilities.domain.vo.AbilityId;

public class AbilityIdMother {
    public static AbilityId create(String value){return new AbilityId(value);}
    public static AbilityId random(){return create(UuidMother.random());}
}
