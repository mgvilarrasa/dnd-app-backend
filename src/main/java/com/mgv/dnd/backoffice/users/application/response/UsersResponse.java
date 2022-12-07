package com.mgv.dnd.backoffice.users.application.response;

import com.mgv.dnd.shared.domain.bus.Response;

import java.util.List;

public class UsersResponse implements Response {
    private final List<UserResponse> users;

    public UsersResponse(List<UserResponse> users) {
        this.users = users;
    }

    public List<UserResponse> users() {
        return users;
    }
}
