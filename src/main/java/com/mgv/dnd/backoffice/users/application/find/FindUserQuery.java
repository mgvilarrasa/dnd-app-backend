package com.mgv.dnd.backoffice.users.application.find;

import com.mgv.dnd.backoffice.users.application.response.UserResponse;
import com.mgv.dnd.shared.domain.bus.Query;

public class FindUserQuery extends Query<UserResponse> {
    private final String id;

    public FindUserQuery(String id){
        this.id = id;
    }

    public String id() {
        return id;
    }
}
