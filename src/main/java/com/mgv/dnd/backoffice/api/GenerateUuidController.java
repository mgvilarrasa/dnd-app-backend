package com.mgv.dnd.backoffice.api;

import com.mgv.dnd.shared.domain.utils.UuidGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerateUuidController {
    @Autowired
    private UuidGenerator generator;

    @GetMapping("/generate")
    public String generateUuid(){
        String uuid = generator.generate();

        return uuid;
    }
}
