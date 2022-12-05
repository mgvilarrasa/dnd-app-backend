package com.mgv.dnd.backoffice.users.domain;

import java.util.Optional;

public interface UserRepository {
    void save(User user);
    Optional<User> search(UserId id);
}
