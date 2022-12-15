package com.mgv.dnd.backoffice.api.abilities;

import com.mgv.dnd.DndApplicationTests;
import org.junit.jupiter.api.Test;

public class AbilitiesGetControllerShould extends DndApplicationTests {
    @Test
    void get_all_abilities() throws Exception{
        assertResponse(
                "/abilities",
                200
        );
    }
}
