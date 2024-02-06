public class For {
    public static void main(String[] args) {
        /* for(initial; test; update){
            Do Something
        }*/

        int num = 5, sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("Sum is " + sum);

        // The Java for loop has an alternative syntax that makes it easy to iterate through arrays and collections.

        /* for(dataType item : array) {
            ...
        }   */
        
        int[] numbers = {1,2,3,4,5};
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
