public class JavaClassAndObjet {
    public static void main(String[] args) {
        // A class is a blueprint for the object

        /* class ClassName{
            // fields
            // methods
        } */

        // object -> instance of the class
        Bicycle sportsBicycle = new Bicycle();

        sportsBicycle.breaking();
        
        Lamp led = new Lamp();
        led.turnOn();
    }
}

// Prototype of object
class Bicycle {
    // state or field 
    private int gear = 5;

    // behaviour or method
    public void breaking(){
        System.out.println("Working of breaking");
    }
}

class Lamp {
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("Light on ? " + isOn);
    }

    void turnOff(){
        isOn = false;
        System.out.println("Light on ?" + isOn);
    }
}
