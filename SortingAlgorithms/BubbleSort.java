package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
   public static void main(String[] args) {
      int[]a = {4,6,3,2,0,1};
      bubbleSort(a);
      System.out.println(Arrays.toString(a));

   }
   public static void bubbleSort(int[]a){
      int n =a.length;
      if(n==1){
         return;
      }
      for (int i = 0; i < n-1 ; i++) {
         boolean flag = false;
         for (int j = 0; j < n-i-1 ; j++) {
            if(a[j]<a[j+1]){
               flag = true;
               int temp = a[j];
               a[j] = a[j+1];
               a[j+1] = temp;
            }
         }
         if(!flag){
            return;
         }
      }
   }
}