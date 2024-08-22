package org.tight.coupling;
// A -> using MySQL, PostgreSQL
//B -> Shifting to MongoDb, i will need to change the hard coded objects;
// in the service class
public class UserDatabase {
    public String getUserDetails(){
        // can use all the database logic here.
        //Directly access db here
        return "User Details From DB";
    }
}
