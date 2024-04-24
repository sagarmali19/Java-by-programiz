package com.sagar;

// Hide the details and make it simple is the main purpose of abstraction
public abstract class MotorBike {
    public abstract void brake();
}

class SportsBike extends MotorBike{
    public void brake(){
        System.out.println("I am sports bike");
    }
}

class MountainBike extends MotorBike{
    public void brake(){
        System.out.println("I am mountain bike");
    }
}

class Main3{
    public static void main(String[] args) {
        SportsBike s1 = new SportsBike();
        s1.brake();
        MountainBike m1 = new MountainBike();
        m1.brake();
    }
}
