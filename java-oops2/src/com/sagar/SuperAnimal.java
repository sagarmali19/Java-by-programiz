package com.sagar;

public class SuperAnimal {
    /*Uses of super keyword
    To call methods of the superclass that is overridden in the subclass.
    To access attributes (fields) of the superclass if both superclass and subclass have attributes with the same name.
    To explicitly call superclass no-arg (default) or parameterized constructor from the subclass constructor.*/

    // we can also access attribute of super class using like : super.name;

    SuperAnimal(){
        System.out.println("I am animal");
    }
}

class SubDog extends SuperAnimal{
    SubDog(){
        // calling default constructor of super class
        // It should always be first statement
        super();
        System.out.println("I am Dog");
    }
}

class Main1{
    public static void main(String[] args) {
        SubDog lab = new SubDog();
    }
}
/*
Even if super() is not used in the subclass constructor, the compiler implicitly calls the default constructor of the superclass.

So, why use redundant code if the compiler automatically invokes super()?

It is required if the parameterized constructor (a constructor that takes arguments) of the superclass has to be called from the subclass constructor.

The parameterized super() must always be the first statement in the body of the constructor of the subclass, otherwise, we get a compilation error.

The compiler can automatically call the no-arg constructor. However, it cannot call parameterized constructors.

If a parameterized constructor has to be called, we need to explicitly define it in the subclass constructor.*/
