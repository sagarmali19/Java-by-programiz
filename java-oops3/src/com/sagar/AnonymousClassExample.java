package com.sagar;

class Polygon{
    public void display(){
        System.out.println("Inside polygon");
    }
}

public class AnonymousClassExample {
    // A nested class that doesn't have any name is known as an anonymous class.

    /*Anonymous classes usually extend subclasses or implement interfaces.
    1. a superclass that an anonymous class extends
    2. an interface that an anonymous class implements*/

    public void createClass(){
        // creation of anonymous class extending Polygon class
        Polygon p1 = new Polygon(){
            @Override
            public void display(){
                System.out.println("Inside ananymous class");
          }
        };
        p1.display();
    }
}

class Main2{
    public static void main(String[] args) {
        AnonymousClassExample an1 = new AnonymousClassExample();
        an1.createClass();
    }
}
