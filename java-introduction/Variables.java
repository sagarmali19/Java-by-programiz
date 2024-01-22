public class Variables {
    public static void main(String[] args){
        // A variable is a location in memory (storage area) to hold data.
        int speedLimit = 80;

        int speedLimit1;
        speedLimit1 = 80;

        /* Java is a statically-typed language. It means that all variables must be 
        declared before they can be used. */

        // Java is case sensitive
        // Variables must start with either a letter or an underscore, _ or a dollar, $ sign
        // Variable names cannot start with numbers or whitespace

        // Boolean Literal
        boolean flag1 = false;
        boolean flag2 = true;

        // Integer Literal
        // binary
        int binaryNumber = 0b10010;
        // octal 
        int octalNumber = 027;

        // decimal
        int decNumber = 34;

        // hexadecimal 
        int hexNumber = 0x2F; // 0x represents hexadecimal
        // binary
        int binNumber = 0b10010; // 0b represents binary

        // Floating-point Literals
        double myDouble = 3.4;
        float myFloat = 3.4F;
    
        // 3.445*10^2
        double myDoubleScientific = 3.445e2;

        // Character Literal
        char letter = 'a';

        // String Literal
        String str1 = "Java Programming";
        String str2 = "Programiz";
    }
}
