public class This {
    int instVar;

    This(int instVar){
        this.instVar = instVar;
        System.out.println("This reference is " + this);
    }

    public static void main(String[] args) {
        This obj = new This(9);
        System.out.println("Object reference is " + obj);
    }

    // if we have instance variable and parameter same, and if we not use this keyword then compiler gets confused and prints 0 instead.
}

// constructor overloading

class Complex{
    private int a, b;

    // constructor with no parameters
    private Complex(){
        // invokes constructor with 0 parameters
        this(0);
    }

    // constructor with 1 parameter
    private Complex(int i){
        // constructor with 2 parameters
        this(i,i);
    }

    // constructor with 2 parameters
    private Complex(int i, int j){
        this.a = i;
        this.b = j;
    }

    @Override
    public String toString(){
        return this.a + " " + this.b + "i";
    }

    public static void main(String[] args){
        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(3);
        Complex c3 = new Complex();

        // print objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // output ->
        // 2 + 3i
        // 3 + 3i
        // 0 + 0i

        /* One of the huge advantages of this() is to reduce the amount of duplicate code. However, we should be always careful while 
        using this(). This is because calling constructor from another constructor adds overhead and it is a slow process. 
        Another huge advantage of using this() is to reduce the amount of duplicate code.Note: Invoking one constructor from another constructor is called explicit constructor invocation. */
    }
}

// passing object as parameter to method
Class ThisExample{
    int x, y;

    ThisExample(int x, int y){
        this.x = x;
        this.y = y;

        System.out.println("Before method : " + "x" + this.x + "y" + this.y);

        add(this);

        System.out.println("After method : " + "x" + this.x + "y" + this.y);
    }

    private void add(ThisExample obj){
        obj.x += 2;
        obj.y += 2;
    }
    
}
