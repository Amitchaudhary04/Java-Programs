package LeetcodeQuestions;
import java.util.*;
public class Q977 {
    public static void main(String[] args) {
        int[] arr = {3, 0, -1, 2, 7};
        System.out.println(Arrays.toString(sort(arr)));
    }
        static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
            Arrays.sort(arr);
        int [] ans = arr;
            return ans;

    }
}
