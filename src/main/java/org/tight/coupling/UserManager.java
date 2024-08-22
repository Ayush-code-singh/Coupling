package org.tight.coupling;

public class UserManager {
    //Get userDetails from DB
    private final UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo(){
       return userDatabase.getUserDetails();
    }
}
