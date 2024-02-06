public class Continue {
    public static void main(String[] args) {
        // continue statement skips the current iteration of a loop
        for(int i = 1; i <= 10; i++){
            if(i > 4 && i < 9 ){
                continue;
            }
            System.out.println(i);
        }

        // labeled continue is used to skip current iteration of outer loop
        // Dont use it, as hard to digest
    }
}
