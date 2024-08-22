package com.example.constructor.injection;

public class Car{

    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Details of the cars =" + specification.toString());
    }

}
