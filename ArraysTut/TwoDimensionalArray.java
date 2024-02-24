package ArraysTut;

import java.util.Arrays;

public class TwoDimensionalArray  {
    public static void main(String[] args) {

        int[][] array2=new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2length is = "+array2.length);

        for (int [] el:array2) {
            System.out.println(el);
        }
        for (int i = 0; i <array2.length ; i++) {
            var innerArray=array2[i];
            for (int j = 0; j < innerArray.length ; j++) {
                System.out.println(array2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
