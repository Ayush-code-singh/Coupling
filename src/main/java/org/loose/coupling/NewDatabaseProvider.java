package org.loose.coupling;

public class NewDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "New DB in action";
    }
}
