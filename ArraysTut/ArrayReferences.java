package ArraysTut;

import java.util.Arrays;

public class ArrayReferences {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        anotherArray[0] = 1;
        modifiedArray(myIntArray);
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

    }
    private static void modifiedArray(int[] array){

        array[1]=2;

    }
}
