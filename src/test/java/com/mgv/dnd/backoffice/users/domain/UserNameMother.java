package com.mgv.dnd.backoffice.users.domain;

import com.mgv.dnd.backoffice.users.domain.vo.UserName;
import com.mgv.dnd.shared.domain.WordMother;

public class UserNameMother {
    public static UserName create(String value) {
        return new UserName(value);
    }

    public static UserName random() {
        return create(WordMother.random());
    }
}
