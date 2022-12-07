package com.mgv.dnd.backoffice.users.domain;

import com.mgv.dnd.backoffice.users.domain.vo.UserEmail;
import com.mgv.dnd.backoffice.users.domain.vo.UserId;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void save(User user);
    Optional<User> searchById(UserId id);
    Optional<User> searchByEmail(UserEmail email);
    List<User> findAll();
}
