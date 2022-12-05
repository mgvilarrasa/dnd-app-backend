package com.mgv.dnd.shared.infraestructure.bus;

import com.mgv.dnd.shared.domain.bus.Command;

public interface CommandBus {
    void dispatch(Command command) throws Exception;
}
