import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        System.out.println("Java Programming");

        /*Difference between println(), print() and printf()
        print() - It prints string inside the quotes.
        println() - It prints string inside the quotes similar like print() method. Then the cursor moves to
        the beginning of the next line.
        printf() - It provides string formatting (similar to printf in C/C++ programming).*/

        System.out.println("1. println ");
        System.out.println("2. println ");

        System.out.print("1. print ");
        System.out.print("2. print");
        // Output ->
       /* 1. println
        2. println
        1. print 2. print*/

        System.out.print("\n");
        String s = "Hello World";
        System.out.printf("The String object is %s", s);

        // Concatination in strings
        Double number = -10.67;
        System.out.println("I am" + "awsome");
        System.out.println("Number is " + number);

        // Input in java
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number - ");
        int number1 = input.nextInt();
        System.out.println("Number is " + number1);

        System.out.println("Input a string - ");
        String str = input.next();
        System.out.println("String is " + str);
    }
}