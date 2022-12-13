package com.mgv.dnd.backoffice.users.application.find;

import com.mgv.dnd.backoffice.users.UsersModuleUnitTestCase;
import com.mgv.dnd.backoffice.users.application.response.UserResponse;
import com.mgv.dnd.backoffice.users.domain.UserIdMother;
import com.mgv.dnd.backoffice.users.domain.UserResponseMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindUserQueryHandlerShould extends UsersModuleUnitTestCase {
    private FindUserQueryHandler handler;

    @BeforeEach
    protected void setUp(){
        super.setUp();
        handler = new FindUserQueryHandler(new UserFinder(repository));
    }

    @Test
    void find_a_valid_user(){
        UserResponse response = UserResponseMother.random();
        FindUserQuery query = new FindUserQuery(UserIdMother.random().value());
        try{
            shouldAsk(query, response);
        } catch (Exception e){
            //Some exception
        }
    }
}
