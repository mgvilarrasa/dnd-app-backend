package com.mgv.dnd.backoffice.users.domain;

import com.mgv.dnd.backoffice.users.domain.vo.UserId;

import java.util.Optional;

public interface UserRepository {
    void save(User user);
    Optional<User> search(UserId id);
}
