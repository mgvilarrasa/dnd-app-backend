package com.mgv.dnd.backoffice.users.domain;

import com.mgv.dnd.backoffice.users.application.response.UserResponse;
import com.mgv.dnd.backoffice.users.domain.vo.UserEmail;
import com.mgv.dnd.backoffice.users.domain.vo.UserId;
import com.mgv.dnd.backoffice.users.domain.vo.UserName;

public class UserResponseMother {
    public static UserResponse create(UserId id, UserName name, UserEmail email) {
        return new UserResponse(id.value(), name.value(), email.value());
    }

    public static UserResponse random() {
        return create(UserIdMother.random(), UserNameMother.random(), UserEmailMother.random());
    }
}
