package com.mgv.dnd.shared.infraestructure.bus;

import com.mgv.dnd.shared.domain.bus.Query;

public interface QueryBus {
    <T> T ask(Query<T> query) throws Exception;
}
