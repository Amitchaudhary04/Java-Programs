package LeetcodeQuestions;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4};
        int n = arr.length;
        System.out.println(check(arr,n));
    }public static int check(int[] arr,int n) {
        boolean[] b = new boolean[n];
        for (int i : arr) {
            if (b[i]) return i;
            b[i] = true;
        }
        return -1;
    }
}
