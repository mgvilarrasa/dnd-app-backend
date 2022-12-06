package com.mgv.dnd.backoffice.users.application.create;

import com.mgv.dnd.backoffice.users.domain.UserEmailMother;
import com.mgv.dnd.backoffice.users.domain.UserIdMother;
import com.mgv.dnd.backoffice.users.domain.UserNameMother;
import com.mgv.dnd.backoffice.users.domain.UserPasswordMother;
import com.mgv.dnd.backoffice.users.domain.vo.UserEmail;
import com.mgv.dnd.backoffice.users.domain.vo.UserId;
import com.mgv.dnd.backoffice.users.domain.vo.UserName;
import com.mgv.dnd.backoffice.users.domain.vo.UserPassword;

public final class CreateUserCommandMother {
    public static CreateUserCommand create(UserId id, UserName userName, UserPassword password, UserEmail email) {
        return new CreateUserCommand(id.value(), userName.value(), password.value(), email.value());
    }

    public static CreateUserCommand random() {
        return create(UserIdMother.random(), UserNameMother.random(), UserPasswordMother.random(), UserEmailMother.random());
    }
}
