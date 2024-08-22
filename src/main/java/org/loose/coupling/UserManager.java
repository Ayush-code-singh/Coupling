package org.loose.coupling;

public class UserManager {
        //reference of an object
    private UserDataProvider userDataProvider;

    // provide implementation to the UserManager
    // Here is the implementation of the interface.

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo() {
        return userDataProvider.getUserDetails();
    }

    //Get userDetails from DB
//    private UserDatabase userDatabase =new UserDatabase();
//
//    public String getUserInfo(){
//       return userDatabase.getUserDetails();

}
