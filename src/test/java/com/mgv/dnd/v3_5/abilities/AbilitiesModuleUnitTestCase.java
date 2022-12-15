package com.mgv.dnd.v3_5.abilities;

import com.mgv.dnd.shared.infrastructure.UnitTestCase;
import com.mgv.dnd.v3_5.abilities.domain.Ability;
import com.mgv.dnd.v3_5.abilities.domain.AbilityRepository;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

public class AbilitiesModuleUnitTestCase extends UnitTestCase {
    protected AbilityRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();
        repository = mock(AbilityRepository.class);
    }

    public void shouldHaveSaved(Ability ability){
        verify(repository, atLeastOnce()).save(ability);
    }
}
