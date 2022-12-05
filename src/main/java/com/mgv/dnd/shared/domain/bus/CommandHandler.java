package com.mgv.dnd.shared.domain.bus;

public interface CommandHandler<T extends Command> {
    void handle(T command) throws Exception;
}
