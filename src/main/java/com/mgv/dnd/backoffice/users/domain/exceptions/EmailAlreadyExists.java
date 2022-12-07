package com.mgv.dnd.backoffice.users.domain.exceptions;

import com.mgv.dnd.backoffice.users.domain.vo.UserEmail;
import com.mgv.dnd.shared.domain.DomainError;

public class EmailAlreadyExists extends DomainError {

    public EmailAlreadyExists(UserEmail email) {
        super("email_already_exists", String.format("The email <%s> is already registered", email.value()));
    }
}
