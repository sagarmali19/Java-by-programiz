public class JavaFinal {
    public static void main(String[] args) {
        /* Once any entity (variable, method or class) is declared final, it can be assigned only once. That is,

        the final variable cannot be reinitialized with another value
        final int AGE = 23;
        AGE = 45; -> you cant do like this
        the final method cannot be overridden
        the final class cannot be extended */
    }
}

class FinalDemo{
    public final void display(){
        System.out.println("Final Method");
    }
}

class ExtendedFinalDemo extends FinalDemo{
    // try to override method
    public final void display(){
        System.out.println("Final method overiden");
    }
    // this is not possible
}

final class FinalClas{
    int i;
    public void display(){
        System.out.println("Final class");
    }
}

// try to extend class
class InheretedFinalClass extends FinalClass{
    // you cant do this
}