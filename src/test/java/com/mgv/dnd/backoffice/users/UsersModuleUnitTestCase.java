package com.mgv.dnd.backoffice.users;

import com.mgv.dnd.backoffice.users.domain.User;
import com.mgv.dnd.backoffice.users.domain.UserRepository;
import com.mgv.dnd.shared.infrastructure.UnitTestCase;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

public class UsersModuleUnitTestCase extends UnitTestCase {
    protected UserRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();
        repository = mock(UserRepository.class);
    }

    public void shouldHaveSaved(User user){
        verify(repository, atLeastOnce()).save(user);
    }
}
