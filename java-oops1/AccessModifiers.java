public class AccessModifiers {
    public static void main(String[] args) {
        /* There are four access modifiers keywords in Java and they are:

        Modifier	Description
        Default	        declarations are visible only within the package (package private)
        Private	        declarations are visible within the class only
        Protected	    declarations are visible within the package or all subclasses
        Public	        declarations are visible everywhere */

        /* if we need to access those private variables. 
        In this case, we can use the getters and setters method. */

        /* we have used the setter method (setName()) to assign value to the variable and the getter method (getName()) 
        to access the variable. */

        /* We cannot declare classes and interfaces private in Java. However, the nested
        classes can be declared private. */

        /* Access modifiers are mainly used for encapsulation. It can help us to control what part of a program can access the members of a class. 
        So that misuse of data can be prevented. */
    }
}
