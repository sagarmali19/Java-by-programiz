public class JavaRecursion {
    static int factorial(int n){
        if(n != 0){
            return n * factorial(n-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int number = 4, result;
        result = factorial(number);
        System.out.println(result);
    }

    // When a recursive call is made, new storage locations for variables are allocated on the stack. As, each recursive call returns, the old variables and parameters are removed from the stack.
    // Hence, recursion generally uses more memory and is generally slow.
}
