public class Array {
    public static void main(String[] args) {
        // How to declare array in java ?
        // dataType[] arrayName;
        double[] data;
        data = new double[10];

        // declare and initialize the array 
        int[] age = {1, 2, 3, 4, 5};

        // access elements of array -> array[index];

        for(int i = 0; i < age.length; i++){
            System.out.println(age[i]);
        }     
        
        // for each loop for array
        int[] numbers = {12, 13, 14};
        for(int j : numbers){
            System.out.println(j);
        }

        // Multidimensional array
        int[][] a = new int[3][4];
        
        int[][] k = {
            {1, 2, 3},
            {3, 4},
            {4, 5, 6, 7}
        };
        System.out.println("Length of row 1 : " + k[0].length);

        for(int i = 0; i < k.length; i++){
            for(int j = 0; j < k[i].length; j++){
                System.out.println(k[i][j]);
            }
        }

        for(int[] innerArray : k){
            for(int data1 : innerArray){
                System.out.println(data1);
            }
        }

        // 3D array
        int[][][] array3d = {
            {
                {1,2},
                {3,4}
            },
            {
                {5,6},
                {7,8}
            }
        };
    }
}
