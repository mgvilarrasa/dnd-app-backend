package com.mgv.dnd.backoffice.users.domain;

import com.mgv.dnd.backoffice.users.domain.vo.UserEmail;
import com.mgv.dnd.backoffice.users.domain.vo.UserId;
import com.mgv.dnd.backoffice.users.domain.vo.UserName;
import com.mgv.dnd.backoffice.users.domain.vo.UserPassword;

public final class User {
    private final UserId id;
    private final UserName userName;
    private final UserPassword password;
    private final UserEmail email;

    public User(UserId id, UserName userName, UserPassword password, UserEmail email){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public static User create(UserId id, UserName userName, UserPassword password, UserEmail email){
        User user = new User(id, userName, password, email);
        return user;
    }

    public UserId Id() {
        return id;
    }

    public UserName UserName() {
        return userName;
    }

    public UserPassword Password() {
        return password;
    }

    public UserEmail Email(){return email;}

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        User user = (User) obj;
        return id.equals(user.id) && userName.equals(user.userName) && password.equals(user.password) && email.equals(user.email);
    }
}
