package com.mgv.dnd.backoffice.users.domain;

import com.mgv.dnd.backoffice.users.domain.vo.UserPassword;
import com.mgv.dnd.shared.domain.WordMother;

public class UserPasswordMother {
    public static UserPassword create(String value) {
        return new UserPassword(value);
    }

    public static UserPassword random() {
        return create(WordMother.random());
    }
}
