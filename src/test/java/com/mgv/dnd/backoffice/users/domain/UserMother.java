package com.mgv.dnd.backoffice.users.domain;

import com.mgv.dnd.backoffice.users.application.create.CreateUserCommand;
import com.mgv.dnd.backoffice.users.domain.vo.UserEmail;
import com.mgv.dnd.backoffice.users.domain.vo.UserId;
import com.mgv.dnd.backoffice.users.domain.vo.UserName;
import com.mgv.dnd.backoffice.users.domain.vo.UserPassword;

public class UserMother {
    public static User create(UserId id, UserName userName, UserPassword password, UserEmail email) {
        return new User(id, userName, password, email);
    }

    public static User fromRequest(CreateUserCommand request) {
        return create(
                UserIdMother.create(request.id()),
                UserNameMother.create(request.userName()),
                UserPasswordMother.create(request.password()),
                UserEmailMother.create(request.email())
        );
    }

    public static User random() {
        return create(UserIdMother.random(), UserNameMother.random(), UserPasswordMother.random(), UserEmailMother.random());
    }
}
