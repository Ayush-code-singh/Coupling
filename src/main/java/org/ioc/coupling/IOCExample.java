package org.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    // entry point
    public static void main(String[] args) {
        // implementation of interface
        // this is reference variable of the interface.

        ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationCompletion.xml");
//        these codes are without configuring the spring dependencies
//        UserDataProvider dataProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDB = new UserManager(dataProvider);
        UserManager userManagerWithDB =
                (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

//        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS =
                (UserManager) context.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWS.getUserInfo());

//        UserDataProvider NewServiceProviderDB = new NewDatabaseProvider();
        UserManager newUserManagerWithDB =
                (UserManager) context.getBean("userManagerWithNewDataProvider");
        System.out.println(newUserManagerWithDB.getUserInfo());

//        Now using the configuration using the spring dependency.
               



    }

}
