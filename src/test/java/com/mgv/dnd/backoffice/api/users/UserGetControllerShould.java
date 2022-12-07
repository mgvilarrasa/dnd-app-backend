package com.mgv.dnd.backoffice.api.users;

import com.mgv.dnd.DndApplicationTests;
import com.mgv.dnd.shared.domain.utils.UuidGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserGetControllerShould extends DndApplicationTests {
    @Autowired
    private UuidGenerator generator;

    @Test
    void find_an_existing_user_by_id() throws Exception {
        String uuid = generator.generate();
        String body = "{\"id\": \"" + uuid + "\",\"userName\": \"UserName1\",\"password\": \"123456\", \"email\": \"test@test.com\"}";
        String responseBody = "{\"id\": \"" + uuid + "\",\"userName\": \"UserName1\",\"email\": \"test@test.com\"}";
        givenThereIsAUser(body);

        assertResponse(String.format("/users/%s", uuid), 200, responseBody);
    }

    @Test
    void no_find_a_non_existing_user_by_id() throws Exception {
        String id   = "4ecc0cb3-05b2-4238-b7e1-1fbb0d5d3661";
        String body = "{\"code\": \"user_not_exists\", \"message\": \"The user <4ecc0cb3-05b2-4238-b7e1-1fbb0d5d3661> doesn't exist\"}";

        assertResponse(String.format("/users/%s", id), 404, body);
    }

    private void givenThereIsAUser(String body) throws Exception {

        assertRequestWithBody("POST", "/users", body, 201);
    }
}
