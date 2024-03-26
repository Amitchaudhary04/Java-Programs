package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args) {
        int [] arr = {1,0,5,3,9,6,7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i <n; i++) {
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp =arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
