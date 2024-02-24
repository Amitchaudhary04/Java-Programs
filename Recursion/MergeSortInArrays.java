package Recursion;

import java.util.Arrays;

public class MergeSortInArrays {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int []ans = sort(arr);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] sort(int[] arr){
        if(arr.length== 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr,0, mid));
        int [] right = sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left , right);
    }
    public static int [] merge(int[] first,int[] last){
        int[] tempo = new int[first.length + last.length];
        int i =0;
        int j =0;
        int k = 0;
        while(i< first.length && j< last.length) {
            if (first[i]<last[j]){
                tempo[k]=first[i];
                i++;
            }
           else{
               tempo[k] = last[j];
               j++;
            }
           k++;
        }
        while(i < first.length){
            tempo[k] = first[i];
            i++;
            k++;
        }
        while(j< last.length){
            j++;
            k++;
        }
        return tempo;
    }
}
