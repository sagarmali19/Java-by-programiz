public class While {
    public static void main(String[] args) {
        /* while (testExpression) {
            // body of loop
        } */

        int i = 1, n = 5, sum = 0;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);

        /* do {
            // body of loop
        } while(textExpression); */

        // executed once before the test expression is checked

        int j = 1;
        do{
            System.out.println(j);
            j++;
        }while(j<=n);

        // for loop -> when number of iterations are known
        // while loop -> when number of iterations are unknown
    }
}
