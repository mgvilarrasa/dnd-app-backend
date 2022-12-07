package com.mgv.dnd.backoffice.users.domain.exceptions;

import com.mgv.dnd.backoffice.users.domain.vo.UserEmail;
import com.mgv.dnd.shared.domain.DomainError;

public class WrongEmailFormat extends DomainError {
    public WrongEmailFormat(UserEmail email){
        super("wrong_error format", String.format("Email <%s> doesn't match correct pattern", email.value()));
    }

}
