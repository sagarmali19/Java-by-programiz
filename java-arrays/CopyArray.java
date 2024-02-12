import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        // Using assignment operator
        int[] numbers = {1,2,3,4};
        int[] positiveIntegers = numbers;

        /* There is a problem with this technique.  If we change elements of one array, 
        corresponding elements of the other arrays also change. */

        /* It's because both arrays refer to the same array object. 
        This is because of the shallow copy */

        // Using looping constructor
        int[] source = {1,2,3};
        int[] dest = new int[3];
        for(int i = 0; i < dest.length; i++){
            dest[i] = source[i];
            // System.out.println(dest[i]);
        }
        // Convert array to string
        System.out.println(Arrays.toString(dest));

        // Using arraycopy() method
        // arraycopy(Object src, int srcPos,Object dest, int destPos, int length)

        int[] n1 = {3,4,5,6,7};
        int[] n3 = new int[5];
        int[] n2 = new int[n1.length];

        // Copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, 5);
        System.out.println("n2 = " + Arrays.toString(n2));
        
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));

        // Using copyOfRange() method
        int[] source1 = {2,3,4,5};

        // copying entire source array to destination
        int[] dest1 = Arrays.copyOfRange(source1, 0, source.length);
        System.out.println("dest1 = " + Arrays.toString(dest1));

        // copying from index 2 to 5 (5 is not included)
        int[] dest2 = Arrays.copyOfRange(source1, 2, 5);
        System.out.println("des2 = " + Arrays.toString(dest2));

        // copy 2d array using loop
        int[][] src = {
            {1,2,3},
            {4,5,6},
            {7,8,9,10}
        };

        int[][] dest3 = new int[src.length][];

        for(int i = 0; i < dest3.length; ++i){
            dest3[i] = new int[src[i].length];

            // way 1
            for(int j = 0; j < dest3[i].length; ++j){
                dest3[i][j] = src[i][j];
            }

            // way 2
            System.arraycopy(src, 0, dest3, 0, dest3[i].length);
        }

        System.out.println(Arrays.deepToString(dest3));
    }
}
