package com.mgv.dnd.backoffice.users.application.find;

import com.mgv.dnd.backoffice.users.application.response.UserResponse;
import com.mgv.dnd.backoffice.users.domain.UserRepository;
import com.mgv.dnd.backoffice.users.domain.exceptions.UserNotExists;
import com.mgv.dnd.backoffice.users.domain.vo.UserId;
import org.springframework.stereotype.Service;

@Service
public class UserFinder {
    private final UserRepository repository;

    public UserFinder(UserRepository repository){
        this.repository = repository;
    }

    public UserResponse findById(UserId id) throws UserNotExists{
        return repository.searchById(id).map(UserResponse::fromAggregate).orElseThrow(() -> new UserNotExists(id));
    }
}
