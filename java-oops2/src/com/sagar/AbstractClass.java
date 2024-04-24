package com.sagar;

public abstract class AbstractClass {
    // We can not create object for the abstract class
    // abstract method : it has not any body
    abstract void display();

    // regular method
    public void display1(){
        System.out.println("regular method");
    }

    /*If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass
    must provide the implementation of the abstract method.*/
}

class SubAbstractClass extends AbstractClass{

    @Override
    void display() {
        System.out.println("implementation of abstract method from abstract super class");
    }
}

class Main2{
    public static void main(String[] args) {
        SubAbstractClass obj = new SubAbstractClass();
        obj.display();
        obj.display1();
    }
}
