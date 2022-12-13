package com.mgv.dnd.backoffice.users.infrastructure;

import com.mgv.dnd.DndApplicationTests;
import com.mgv.dnd.backoffice.users.domain.User;
import com.mgv.dnd.backoffice.users.domain.UserIdMother;
import com.mgv.dnd.backoffice.users.domain.UserMother;
import com.mgv.dnd.backoffice.users.domain.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public class MySqlUserRepositoryShould extends DndApplicationTests {
    @Autowired
    private UserRepository repository;

    @Test
    void save_user(){
        User user = UserMother.random();
        repository.save(user);
    }

    @Test
    void return_an_existing_user_by_id(){
        User user = UserMother.random();
        repository.save(user);
        assertEquals(Optional.of(user), repository.searchById(user.Id()));
    }

    @Test
    void return_an_existing_user_by_email(){
        User user = UserMother.random();
        repository.save(user);
        assertEquals(Optional.of(user), repository.searchByEmail(user.Email()));
    }

    @Test
    void return_non_existing_user(){
        assertFalse(repository.searchById(UserIdMother.random()).isPresent());
    }
}
