package com.mgv.dnd.backoffice.users.application.search_all;

import com.mgv.dnd.backoffice.users.application.response.UserResponse;
import com.mgv.dnd.backoffice.users.application.response.UsersResponse;
import com.mgv.dnd.backoffice.users.domain.User;
import com.mgv.dnd.backoffice.users.domain.UserRepository;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class AllUsersSearcher {
    private final UserRepository repository;

    public AllUsersSearcher(UserRepository repository){
        this.repository = repository;
    }

    public UsersResponse findAll(){
        return new UsersResponse(repository.findAll().stream().map(UserResponse::fromAggregate).collect(Collectors.toList()));
    }
}
