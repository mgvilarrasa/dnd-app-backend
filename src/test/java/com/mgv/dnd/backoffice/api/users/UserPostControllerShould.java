package com.mgv.dnd.backoffice.api.users;

import com.mgv.dnd.DndApplicationTests;
import com.mgv.dnd.backoffice.users.domain.UserEmailMother;
import com.mgv.dnd.shared.domain.utils.UuidGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public final class UserPostControllerShould extends DndApplicationTests {
    @Autowired
    private UuidGenerator generator;

    @Test
    void create_a_valid_non_existing_user() throws Exception{
        String uuid = generator.generate();
        String email = UserEmailMother.random().value();
        assertRequestWithBody(
                "POST",
                "/users",
                "{\"id\": \"" + uuid + "\",\"userName\": \"UserName1\",\"password\": \"123456\", \"email\": \"" + email + "\"}",
                201
        );
    }

    @Test
    void create_non_valid_non_existing_user() throws Exception{
        String uuid = generator.generate();
        assertRequestWithBodyAndSomeResponse(
                "POST",
                "/users",
                "{\"id\": \"" + uuid + "\",\"userName\": \"UserName1\",\"password\": \"123456\", \"email\": \"test.com\"}",
                400
        );
    }
}