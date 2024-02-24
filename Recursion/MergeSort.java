package Recursion;

import java.util.Arrays;

public class MergeSort {
    //Task 1 = divide the array to find the middle element
    //Task 2 =
    public static void main(String[] args) {
         int [] arr={8,1,9,10,20,5,11,0};
         int startIndex= 0;
         int endIndex= arr.length -1;
        System.out.println("Unsorted Array is : " + Arrays.toString(arr));
         mergeSort(arr,startIndex,endIndex);

        System.out.println("Sorted Array is : " + Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr ,int startIndex,int endIndex){
        if (startIndex==endIndex) {
            return;
        }

            int midPoint = startIndex + (endIndex - startIndex) / 2;
            mergeSort(arr, startIndex, midPoint); //Left Array
            mergeSort(arr, midPoint + 1, endIndex); //Right Array

            merge(arr,startIndex,midPoint,endIndex);
    }
    public static void merge(int[] arr,int startIndex,int midPoint,int endIndex){
        int [] temArray = new int[endIndex - startIndex +1];
        int leftArray=startIndex;
        int rightArray=midPoint+1;
        int index = 0;

        while (leftArray <= midPoint && rightArray <= endIndex ){
            //Sorting
            if(arr[leftArray]<=arr[rightArray]){
                temArray[index]=arr[leftArray];
                index++;
                leftArray++;
            }
            else{
                temArray[index]=arr[rightArray];
                index++;
                rightArray++;
            }
        }
        while(leftArray <= midPoint){
            temArray[index]=arr[leftArray];
            index++;
            leftArray++;
        }
        while(rightArray <= endIndex){
            temArray[index]=arr[rightArray];
            index++;
            rightArray++;
        }
        int count = 0;
        for (int i = startIndex; i <=endIndex ; i++) {
            arr[i]=temArray[count];
            count++;

        }
    }
}
