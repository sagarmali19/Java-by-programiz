public class JavaMethods {
    public static void main(String[] args){
        /* returnType methodName(){
            // method body
        } */

        /* static - If we use the static keyword, it can be accessed without creating objects.
        For example, the sqrt() method of standard Math class is static. Hence, 
        we can directly call Math.sqrt() without creating an instance of Math class. */

        // If the method does not return any value, we use the void keyword as the return type of the method.

        /* The return types of the above methods are not the same. It is because method 
        overloading is not associated with return types. Overloaded methods may have the same 
        or different return types, but they must differ in parameters. */

        // Overloading by changing number of parameters
        // Overloading by changing data type of parameters
        
        display(12);
        display(12.20);
    }

    private static void display(int a){
        System.out.println("Number is " + a);
    }

    private static void display(double a){
        System.out.println("Double number is " + a);
    }

    /* It is not method overloading if we only change the return type of methods. 
    There must be differences in the number of parameters. */
}
