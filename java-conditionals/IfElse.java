public class IfElse {
    public static void main(String[] args) {
        /*if (condition) {
            // statements
        }*/

        int number = 10;
        if(number < 20) {
            System.out.println("Number is smaller");
        }

        String language = "JAVA";
        if(language == "JAVA") {
            System.out.println("Language is " + language);
        }

        /*if (condition) {
            // codes in if block
        }
        else {
            // codes in else block
        }*/

        if(number < 9) {
            System.out.println("Number is smaller");
        }
        else {
            System.out.println("Number is greater");
        }

        /*if (condition1) {
            // codes
        }
        else if(condition2) {
            // codes
        }
        else if (condition3) {
            // codes
        }
        .
        .
        else {
            // codes
        }*/

        if(number < 5) {
            System.out.println("Number is smaller");
        }
        else if(number > 5) {
            System.out.println("Number is greater");
        }
        else {
            System.out.println("Number is equal to 5");
        }

        // Nested if else statement

        int num1 = 11, num2 = 12, num3 = 13;
        if(num1 > num2){
            if(num1 > num3){
                System.out.println("Largest number is " + num1);
            }
        }
        else if (num2 > num3) {
            System.out.println("Largest number is " + num2);
        }
        else {
            System.out.println("Largest number is " + num3);
        }
    }
}