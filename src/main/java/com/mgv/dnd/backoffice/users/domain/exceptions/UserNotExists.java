package com.mgv.dnd.backoffice.users.domain.exceptions;

import com.mgv.dnd.backoffice.users.domain.vo.UserId;
import com.mgv.dnd.shared.domain.DomainError;

public class UserNotExists extends DomainError {
    public UserNotExists(UserId id){
        super("user_not_exists", String.format("The user <%s> doesn't exist", id.value()));
    }
}
