package com.sagar;

public class NestedClassExample {
    // two types of nested classes :
    // 1. Non static nested class 2. Static nested class
    // Non static nested class example

    double memory;

    class RAM{
        String name;
        public void display(String name, double memory){
            // accessing field from outer class - we need to mention outer class name
            // as this keyword will assume that method wants to use field from the same class
            NestedClassExample.this.memory = memory;
            System.out.println("I am RAM " + name);
            System.out.println(memory);
        }
    }

    protected class Cache{
        int cacheMemory;
        public void display(int cacheMemory){
            System.out.println(cacheMemory);
        }
    }
}

class Main{
    public static void main(String[] args) {
        // we need to initialize parent class first before nested classes
        NestedClassExample cpu = new NestedClassExample();
        cpu.memory = 34.56;
        // initialize the nested class object with parent class object
        NestedClassExample.RAM ram = cpu.new RAM();
        ram.name = "MD5";
        ram.display(ram.name, cpu.memory);
    }
}
