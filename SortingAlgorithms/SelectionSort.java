package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {9,7,4,5,3,1,0,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[]arr){
        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {
            //suppose the minIndex is i
            int minIndex = i;
            for (int j = i+1; j < n ; j++) {
                if(arr[j]>arr[minIndex]){//in descending order
                    minIndex = j;
                }
            }
            //swap the elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
