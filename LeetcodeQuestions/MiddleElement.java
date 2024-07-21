package LeetcodeQuestions;

import java.util.Arrays;

public class MiddleElement {
    public static void main(String[] args) {
        int[] arr= middleFunc(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(arr));

    }
    public static int[] middleFunc(int[]array){
        if(array.length<=2){
            return new int[0];
        }
        int[] middleArray=new int[array.length-2];
        int index=1;
        while (index< array.length-1){
            middleArray[index-1]=array[index];
            index++;
        }
        return middleArray;
    }
}
