package com.mgv.dnd.backoffice.users.application.find;

import com.mgv.dnd.backoffice.users.application.response.UserResponse;
import com.mgv.dnd.backoffice.users.domain.exceptions.UserNotExists;
import com.mgv.dnd.backoffice.users.domain.vo.UserId;
import com.mgv.dnd.shared.domain.bus.QueryHandler;
import org.springframework.stereotype.Component;

@Component
public class FindUserQueryHandler implements QueryHandler<UserResponse, FindUserQuery> {
    private final UserFinder userFinder;

    public FindUserQueryHandler(UserFinder finder){
        this.userFinder = finder;
    }

    @Override
    public UserResponse ask(FindUserQuery query) throws UserNotExists {
        return userFinder.findById(new UserId(query.id()));
    }
}
