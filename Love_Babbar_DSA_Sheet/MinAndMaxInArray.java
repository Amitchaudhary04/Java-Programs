package Love_Babbar_DSA_Sheet;

public class MinAndMaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number in array is : " +min);

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println("Maximum number in array is : " +max);
    }
}
