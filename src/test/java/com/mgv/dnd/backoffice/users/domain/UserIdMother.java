package com.mgv.dnd.backoffice.users.domain;

import com.mgv.dnd.backoffice.users.domain.vo.UserId;
import com.mgv.dnd.shared.domain.UuidMother;

public final class UserIdMother {
    public static UserId create(String value){return new UserId(value);}
    public static UserId random(){return create(UuidMother.random());}
}
