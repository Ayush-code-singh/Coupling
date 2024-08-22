package org.ioc.coupling;

public class WebServiceDataProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "Fetching from Web Services";
    }
}
