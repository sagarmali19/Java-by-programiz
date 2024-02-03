public class Operators{
    public static void main(String[] args){
        // Arithmatic operator
        // declare variables
        int a = 12, b = 5;

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));

        // Assignment operator
        // create variables
        int a1 = 4;
        int var;

        // assign value using =
        var = a1;
        System.out.println("var using =: " + var);

        // assign value using =+
        var += a1;
        System.out.println("var using +=: " + var);

        // assign value using =*
        var *= a1;
        System.out.println("var using *=: " + var);

        // Relational operator
        // create variables
        int a2 = 7, b2 = 11;

        // value of a and b
        System.out.println("a2 is " + a2 + " and b2 is " + b2);

        // == operator
        System.out.println(a2 == b2);  // false

        // != operator
        System.out.println(a2 != b2);  // true

        // > operator
        System.out.println(a2 > b2);  // false

        // < operator
        System.out.println(a2 < b2);  // true

        // >= operator
        System.out.println(a2 >= b2);  // false

        // <= operator
        System.out.println(a2 <= b2);  // true

        // Logical operator
        // && operator
        System.out.println((5 > 3) && (8 > 5));  // true

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true

        // ! operator
        System.out.println(!(5 == 3));  // true

        // Unary operator
        // declare variables
        int a3 = 12, b3 = 12;
        int result1, result2;

        // original value
        System.out.println("Value of a: " + a3);

        // increment operator
        result1 = ++a3;
        System.out.println("After increment: " + result1);

        System.out.println("Value of b3: " + b3);

        // decrement operator
        result2 = --b3;
        System.out.println("After decrement: " + result2);

        // Bitwise operators

        // Instanceof operator
        String str = "Programiz";
        boolean result;

        // checks if str is an instance of
        // the String class
        result = str instanceof String;
        System.out.println("Is str an object of String? " + result);

        // Ternary operator
        /*If the Expression is true, expression1 is assigned to the variable.
        If the Expression is false, expression2 is assigned to the variable.*/
        int februaryDays = 29;
        String result3;

        // ternary operator
        result3 = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result3);

    }
}