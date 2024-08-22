package com.example.bean;

//  After making a bean class we will need the Bean container to manage this class object for us
//  For that we need a config file and put the container there.

public class MyBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
//    What happens here is Spring IOC sets the message from the context file and sets the message in setMessage function.

    public void ShowMessage() {
        System.out.println("Message =" + message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
