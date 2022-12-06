package com.mgv.dnd.backoffice.users.application.create;

import com.mgv.dnd.backoffice.users.UsersModuleUnitTestCase;
import com.mgv.dnd.backoffice.users.domain.User;
import com.mgv.dnd.backoffice.users.domain.UserMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

final class CreateUserCommandHandlerShould extends UsersModuleUnitTestCase{
    private CreateUserCommandHandler handler;

    @BeforeEach
    protected void setUp(){
        super.setUp();
        handler = new CreateUserCommandHandler(new UserCreator(repository));
    }

    @Test
    void create_a_valid_user(){
        CreateUserCommand command = CreateUserCommandMother.random();
        User user = UserMother.fromRequest(command);
        try{
            handler.handle(command);
        } catch (Exception e){
            //Some exception
        }
        shouldHaveSaved(user);
    }
}