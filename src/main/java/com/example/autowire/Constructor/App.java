package com.example.autowire.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//  This is done by Constructor Injection
public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("autowireByConstructor.xml");

        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
