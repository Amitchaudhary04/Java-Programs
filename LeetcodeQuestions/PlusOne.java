package LeetcodeQuestions;

import java.util.*;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[]arr){
        int n = arr.length;
        for (int i = n-1; i >=0 ; i--) {
            arr[i]++;

            if (arr[i] <= 9) {
                return arr;

            } else arr[i] = 0;
        }
        int[] ans = new int[n+1];
        ans[0] = 1;
        return ans;
    }
}