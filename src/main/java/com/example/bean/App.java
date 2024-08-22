package com.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        Load Spring Context from the applicationBeanContext.xml file
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");
//        After loading the objects from  the configuration files.
//        Load the beans over here using the context.getBean

        MyBean myBean =
                (MyBean) context.getBean("myBean");


        System.out.println(myBean);


    }
}
