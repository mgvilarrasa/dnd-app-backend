package com.mgv.dnd.backoffice.users.domain;

import com.mgv.dnd.backoffice.users.domain.vo.UserEmail;
import com.mgv.dnd.shared.domain.WordMother;

public class UserEmailMother {
    public static UserEmail create(String value) {
        return new UserEmail(value);
    }

    public static UserEmail random() {
        return create(WordMother.random() + "@" + WordMother.random() + ".com");
    }
}
