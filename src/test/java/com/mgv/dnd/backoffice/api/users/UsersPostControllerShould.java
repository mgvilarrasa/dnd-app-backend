package com.mgv.dnd.backoffice.api.users;

import com.mgv.dnd.DndApplicationTests;
import org.junit.jupiter.api.Test;

public final class UsersPostControllerShould extends DndApplicationTests {
    @Test
    void create_a_valid_non_existing_user() throws Exception{
        assertRequestWithBody(
                "POST",
                "/users",
                "{\"userName\": \"UserName1\",\"password\": \"123456\", \"email\": \"test@test.com\"}",
                201
        );
    }
}