package com.mgv.dnd.backoffice.users.domain;

public final class User {
    private final UserId id;
    private final UserName name;
    private final UserSurname surname;

    public User(UserId id, UserName name, UserSurname surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public UserId Id() {
        return id;
    }

    public UserName Name() {
        return name;
    }

    public UserSurname Surname() {
        return surname;
    }

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
        return id.equals(user.id) && name.equals(user.name) && surname.equals(user.surname);
    }
}
