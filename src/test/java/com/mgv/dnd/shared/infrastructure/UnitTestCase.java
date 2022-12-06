package com.mgv.dnd.shared.infrastructure;

import com.mgv.dnd.shared.domain.bus.Query;
import com.mgv.dnd.shared.domain.bus.Response;
import com.mgv.dnd.shared.domain.utils.UuidGenerator;
import com.mgv.dnd.shared.infraestructure.bus.QueryBus;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

public abstract class UnitTestCase {
    protected QueryBus queryBus;
    protected UuidGenerator uuidGenerator;

    @BeforeEach
    protected void setUp() {
        queryBus      = mock(QueryBus.class);
        uuidGenerator = mock(UuidGenerator.class);
    }

    public void shouldGenerateUuid(String uuid) {
        when(uuidGenerator.generate()).thenReturn(uuid);
    }

    public void shouldGenerateUuids(String uuid, String... others) {
        when(uuidGenerator.generate()).thenReturn(uuid, others);
    }

    public void shouldAsk(Query query, Response response) throws Exception {
        when(queryBus.ask(query)).thenReturn(response);
    }
}
