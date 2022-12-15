package com.mgv.dnd.backoffice.users.application.response;

import com.mgv.dnd.backoffice.users.domain.User;
import com.mgv.dnd.shared.domain.bus.Response;

public class UserResponse implements Response {
    private final String id;
    private final String userName;
    private final String email;

    public UserResponse(String id, String userName, String email){
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public static UserResponse fromAggregate(User user){
        return new UserResponse(user.id().value(), user.userName().value(), user.email().value());
    }

    public String id() {
        return id;
    }

    public String userName() {
        return userName;
    }

    public String email() {
        return email;
    }
}
