package JovacInternship;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {2, 5, 7, 0};
        int[] b = {1, 9, 3, 4};
        // Sort the arrays before merging
        Arrays.sort(a);
        Arrays.sort(b);
        int[] ans = new int[a.length + b.length];
        System.out.println(Arrays.toString(merge(a, b, ans)));
    }

    public static int[] merge(int[] a, int[] b, int[] ans) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans[k] = a[i];
                i++;
            } else {
                ans[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            ans[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            ans[k] = b[j];
            j++;
            k++;
        }
        return ans;
    }
}