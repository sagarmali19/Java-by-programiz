public class DataType {
    public static void main(String[] args){
        // 8 primitive data type

        // Boolean Type -> true or false 
        // Default value = false 
        boolean flag = true;
        System.out.println(flag);

        // Byte type -> range(-128 to 127)
        // Default value = 0
        byte number = 124;
        System.out.println(number);

        // Short type -> range(-32768 to 32767)
        // Default value = 0
        short temp = -200;
        System.out.println(temp);

        // Int type -> range( -2^31 to 2^31-1)
        // Default value = 0
        int number1 = -4200000;
        System.out.println(number1);

        // Long type -> range(-2^63 to 2^63-1)
        // Default value = 0
        long long_number = -42332200000L;
        System.out.println(long_number);

        // Double type -> 64-bit floating-point.
        // Default value = 0.0d
        double double_number = 23.4;
        System.out.println(double_number);

        // float type -> 32-bit floating-point
        // Default value = 0.0f
        float fraction = 42.3f;
        System.out.println(fraction);

        // char type -> 16-bit Unicode character
        // Default value = '\u0000'
        char letter = '\u0051';
        System.out.println(letter); // prints Q

        char letter1 = '9';
        System.out.println(letter1);  // prints 9
            
        char letter2 = 65;
        System.out.println(letter2);  // prints A

        /* Java also provides support for character strings via java.lang.String class. 
        Strings in Java are not primitive types. Instead, they are objects. */

        String myString = "Java Programming";
        System.out.println(myString);
    }

}
