package com.sagar;

// Parent class -> superclass
public class Animal {
    // Superclass and subclass
    // The extends keyword is used to perform inheritance in Java

    String name;

    public void eat(){
        System.out.println("I can eat");
    }
}

// Child class -> subclass
class Dog extends Animal{
    public void display(){
        System.out.println("My name is " + name);
    }

    // method overriding
    @Override
    public void eat(){
        super.eat();
        System.out.println("I can bark and eat");
    }
}

class Main{
    public static void main(String[] args) {
        // object creation
        Dog germanShephard = new Dog();
        // Access name of superclass through subclass object instrance
        germanShephard.name = "Sagar";
        // here it is called from subclass if super is not used
        germanShephard.eat();
        germanShephard.display();
    }
}

// the method in the subclass overrides the method in the superclass. This concept is known as method overriding in Java.

// If we want to call the method from parent class then we use super keyword

// In Java, if a class includes protected fields and methods, then these fields and methods are accessible from the subclass of the class.

// Method overriding is also known as runtime polymorphism. Hence, we can achieve Polymorphism in Java with the help of inheritance.

// The most important use of inheritance in Java is code reusability. The code that is present in the parent class can be directly used by the child class.

/*

Types of inheritance :

single : single subclass extends from a single superclass
multilevel : subclass extends from a superclass and then the same subclass acts as a superclass for another class
Hierarchial : multiple subclasses extend from a single superclass
multiple : single subclass extends from multiple superclasses.
Hybrid : combination of two and more

*/

