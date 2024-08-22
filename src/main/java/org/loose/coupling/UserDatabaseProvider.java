package org.loose.coupling;

// A -> using MySQL, PostgreSQL
//B -> Shifting to Web Services, MongoDb, need to change the hard coded objects;
// in the service class
// use interface or abstract class for getting the userDetails.

public class UserDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserDetails(){
        // can use all the database logic here.
        //Directly access db here
        return "User Details From DB";
    }

}
