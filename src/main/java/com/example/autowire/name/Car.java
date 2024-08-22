package com.example.autowire.name;

public class Car{

    private Specification specification1;
//     Autowire by:
//     specification :by Name and it will find matching bean with this name
//     specification :by Bean
//     Down: Autowire by Constructor

// Setting it according to the setter which is called. When I used specification ,
// I used setSpecification to fetch values from this  setSpecification and
// When I use setSpecification1 name , I will have to set setSpecification1
// To fetch values from  setSpecification1.

    public void setSpecification1(Specification specification) {
        this.specification1 = specification;
    }

    public void displayDetails() {
        System.out.println("Details of the cars =" + specification1.toString());
    }

}
