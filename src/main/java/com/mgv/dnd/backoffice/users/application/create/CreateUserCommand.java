package com.mgv.dnd.backoffice.users.application.create;

import com.mgv.dnd.shared.domain.bus.Command;

public class CreateUserCommand extends Command {
    private String userId;
    private String userName;
    private String userSurname;

    public CreateUserCommand(String userId, String userName, String userSurname) {
        this.userId = userId;
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }
}
