public class Switch {
    public static void main(String[] args) {
        /*switch (expression) {

            case value1:
                // code
                break;

            case value2:
                // code
                break;

            ...
            ...

            default:
                // default statements
        }*/

        int number = 50;
        String size;

        switch(number){
            case 5:
                size = "Small";
                break;
            case 50:
                size = "Large";
                break;
            default:
                size = "Unknown";
        }

        System.out.println(size);
    }

    // If break statement is not used -> all statements after break will be executed
    // Default case -> If expression doesn,t matches any case then it is executed
}
