package com.example.autowire.Bean;

public class Car{

    private Specification specification;
//     Autowire by:
//     specification :by Name and it will find matching bean with this name
//     specification :by Bean
//     Down: Autowire by Constructor


    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Details of the cars =" + specification.toString());
    }

}
