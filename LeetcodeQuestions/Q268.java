package LeetcodeQuestions;

import java.util.Arrays;

public class Q268 {
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        int range = arr.length;
        int actualSum = (range * (range + 1)) / 2;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
        }
        int ans = actualSum - currentSum;
        System.out.println(ans);
    }
}