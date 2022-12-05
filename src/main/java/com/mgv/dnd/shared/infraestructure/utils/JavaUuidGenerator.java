package com.mgv.dnd.shared.infraestructure.utils;

import com.mgv.dnd.shared.domain.utils.UuidGenerator;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public final class JavaUuidGenerator implements UuidGenerator {
    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
