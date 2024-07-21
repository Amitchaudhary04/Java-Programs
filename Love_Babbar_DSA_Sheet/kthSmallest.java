package Love_Babbar_DSA_Sheet;
import java.util.*;
public class kthSmallest {
    public static void main(String[] args) {
        int[] arr = {12,3,5,7,19};
        int k = 2;
        System.out.println(smallest(arr,k));
    }
    public static int smallest(int[] arr, int k) {

        Arrays.sort(arr);
        return arr[k-1];
    }
}
