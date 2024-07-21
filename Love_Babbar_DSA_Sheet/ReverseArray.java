package Love_Babbar_DSA_Sheet;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Original Array : " +Arrays.toString(arr));
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array : " + Arrays.toString(arr));
    }
}
