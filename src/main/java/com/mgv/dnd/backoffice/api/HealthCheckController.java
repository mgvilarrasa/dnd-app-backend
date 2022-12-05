package com.mgv.dnd.backoffice.api;

import com.mgv.dnd.shared.infraestructure.bus.CommandBus;
import com.mgv.dnd.shared.infraestructure.bus.QueryBus;
import com.mgv.dnd.shared.infraestructure.spring.ApiController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HealthCheckController extends ApiController {
    public HealthCheckController(QueryBus queryBus, CommandBus commandBus){
        super(queryBus, commandBus);
    }

    @GetMapping("/health-check")
    public HashMap<String, String> index(){
        HashMap<String, String> status = new HashMap<>();
        status.put("entrypoint", "backoffice");
        status.put("status", "ok");

        return status;
    }
}
