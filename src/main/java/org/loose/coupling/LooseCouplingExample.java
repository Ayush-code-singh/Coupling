package org.loose.coupling;

import org.springframework.beans.factory.annotation.Autowired;

public class LooseCouplingExample {
    // entry point
    public static void main(String[] args) {
        // implementation of interface
        // this is reference variable of the interface.

//        these codes are without configuring the spring dependencies
        UserDataProvider dataProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(dataProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider NewServiceProviderDB = new NewDatabaseProvider();
        UserManager newUserManagerWithDB = new UserManager(NewServiceProviderDB);
        System.out.println(newUserManagerWithDB.getUserInfo());

//        Now using the configuration using the spring dependency.
               



    }

}
