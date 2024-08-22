package com.example.setter.injection;

public class Car{
    private Specification specification;

//    This is constructor injection
//    public Car(Specification specification) {
//        this.specification = specification;
//    }

//      This is setter injection
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Details of the cars =" + specification.toString());
    }
}
