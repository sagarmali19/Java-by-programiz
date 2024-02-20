public class JavaConstructor {
    private String name;

    // No arg constructor
    JavaConstructor(){
        System.out.println("Inside the constructor");
    }

    public void showOutput(){
        System.out.println("This is method inside class");
    }

    public static void main(String[] args) {
        JavaConstructor obj = new JavaConstructor();
        obj.showOutput();
        String name = "Sagar";
        JavaConstructor obj2 = new JavaConstructor("Sagar");
    }

    // Three types of constructor :
    // No arg constructor

    /* Once a constructor is declared private, it cannot be accessed from outside the class.
    So, creating objects from outside the class is prohibited using the private constructor. */

    // Parametrized constructor
    // Doing constructor overloading
    JavaConstructor(String name){
        System.out.println("Name is " + name);
    }

    // Default constructor
    // If we do not create any constructor, the Java compiler automatically creates a no-arg constructor during the execution of the program.
    // The default constructor initializes any uninitialized instance variables with default values.
    // e.g boolean -> false


    /* A constructor cannot be abstract or static or final.
    A constructor can be overloaded but can not be overridden. */
}
