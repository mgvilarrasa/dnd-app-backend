package com.mgv.dnd.backoffice.users.application.create;

import com.mgv.dnd.shared.domain.bus.Command;

public class CreateUserCommand extends Command {
    private final String userId;
    private final String userName;
    private final String userPassword;
    private final String userEmail;

    public CreateUserCommand(String userId, String userName, String userPassword, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }

    public String id() {
        return userId;
    }

    public String userName() {
        return userName;
    }

    public String password() {
        return userPassword;
    }

    public String email() {
        return userEmail;
    }
}
