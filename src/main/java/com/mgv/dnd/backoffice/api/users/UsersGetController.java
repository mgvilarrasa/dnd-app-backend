package com.mgv.dnd.backoffice.api.users;

import com.mgv.dnd.backoffice.users.application.response.UsersResponse;
import com.mgv.dnd.backoffice.users.application.search_all.SearchAllUsersQuery;
import com.mgv.dnd.shared.infraestructure.ResponseError;
import com.mgv.dnd.shared.infraestructure.bus.CommandBus;
import com.mgv.dnd.shared.infraestructure.bus.QueryBus;
import com.mgv.dnd.shared.infraestructure.spring.ApiController;
import com.mgv.dnd.shared.infraestructure.utils.ErrorMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UsersGetController extends ApiController {
    public UsersGetController(QueryBus queryBus, CommandBus commandBus) {
        super(queryBus, commandBus);
    }

    @GetMapping(value = "/users")
    public List<HashMap<String, String>> searchAllUsers(){
        try{
            UsersResponse userList = ask(new SearchAllUsersQuery());
            return userList.users().stream().map(response -> new HashMap<String, String>() {{
                put("id", response.id());
                put("userName", response.userName());
                put("email", response.email());
            }}).collect(Collectors.toList());
        } catch (Exception e){
            ResponseError error = ErrorMapper.mapDomainError(e);
            List<HashMap<String, String>> errorList = new ArrayList<>();
            errorList.add(error.errorBody());
            return errorList;
        }
    }
}
