package LeetcodeQuestions;

import java.util.Arrays;

public class Increse1inArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(Arrays.toString(increase(arr)));
    }
    public static int[] increase(int[]arr){
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%2!=0){
                arr[i]++;
            }

        }
        return arr;
    }
}
