package com.mgv.dnd.backoffice.users.infrastructure;

import com.mgv.dnd.DndApplicationTests;
import com.mgv.dnd.backoffice.users.domain.User;
import com.mgv.dnd.backoffice.users.domain.UserMother;
import com.mgv.dnd.backoffice.users.domain.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

@Transactional
public class MySqlUserRepositoryShould extends DndApplicationTests {
    @Autowired
    private UserRepository repository;

    @Test
    void save_user(){
        User user = UserMother.random();
        repository.save(user);
    }
}
