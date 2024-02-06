public class Break {
    public static void main(String[] args) {
        // Break statement is always used to break the loop
        int i;
        for(i = 1; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }

        // unlabeled break statement -> break innermost loop
        // labeled break statement -> terminate the outermost loop as well.

        first:
        for(int j = 1; j < 5; j++){
            second:
            for(int k = 1; k < 3; k++){
                System.out.println("j is " + j + " " + "k is " + k);
                if(j == 2){
                    break first;
                }
            }
        }
    }
}
