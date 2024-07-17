package LeetcodeQuestions;

public class Q34 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 30, 40, 50};
        int target = 30;

        int[] result = search(arr, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }

    public static int[] search(int[] arr, int target) {
        int[] ans = {-1, -1};
        if (arr.length == 0) {
            return ans;
        }
        ans[0] = firstOccurrence(arr, target);
        ans[1] = lastOccurrence(arr, target);
        return ans;
    }

    public static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
