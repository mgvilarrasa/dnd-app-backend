package com.mgv.dnd.backoffice.users.domain.vo;

import com.mgv.dnd.backoffice.users.domain.exceptions.WrongEmailFormat;
import com.mgv.dnd.shared.domain.vo.StringValueObject;

import java.util.regex.Pattern;

public class UserEmail extends StringValueObject {
    public UserEmail(String value) {
        super(value);
    }
}
