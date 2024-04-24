package com.sagar;

// interfaces are fully abstract classes
interface Polygon {
    // this is abstract method
    // this is by default public
    void getArea(int l, int b);

    // default method : need not be implemented by every class that implements interface
    default void getSide(){
        System.out.println("I can tell you the side");
    }
}

class Rectangle implements Polygon{
    public void getArea(int l, int b){
        System.out.println("Area of rectangle is " + l*b);
    }

    @Override
    public void getSide(){
        System.out.println("I have 4 sides");
    }
}

class Main4{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(4,5);
        r1.getSide();
    }
}

/*
Advantages of interfaces in java :

        Similar to abstract classes, interfaces help us to achieve abstraction in Java.

        Here, we know getArea() calculates the area of polygons, but the way area is calculated is different for different polygons. Hence, the implementation of getArea() is independent of one another.
        Interfaces provide specifications that a class (which implements it) must follow.

        In our previous example, we used getArea() as a specification inside the interface Polygon. This is like setting a rule that we should be able to get the area of every polygon.

        Now any class that implements the Polygon interface must provide an implementation for the getArea() method.
        Interfaces are also used to achieve multiple inheritance in Java.*/
// All the methods inside an interface are implicitly public and all fields are implicitly public static final.

