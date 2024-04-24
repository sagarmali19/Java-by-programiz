package com.sagar;

public class StaticNestedClassExample {
    /*Unlike inner class, a static nested class cannot access the member variables of the outer class.
    It is because the static nested class doesn't require you to create an instance of the outer class.*/

    static class USB{
        String usb1;
        public void display(String usb1){
            this.usb1 = usb1;
            System.out.println(usb1);
        }
    }

    // Also we can not access non static method from static class
    // Java doesn't allow static top-level class
}

class Main1{
    public static void main(String[] args) {
        StaticNestedClassExample.USB usb = new StaticNestedClassExample.USB();
        usb.usb1 = "USB2000";
        usb.display(usb.usb1);
    }
}