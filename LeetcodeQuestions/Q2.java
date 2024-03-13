package LeetcodeQuestions;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = {4,3,2,1};
        maximum(arr);
        minimum(arr);
        System.out.println(Index(arr,-1));
        System.out.println(sumExists(arr, arr.length,7 ));
        sumOfElements(arr);
        reverseArray(arr);
        copyElements(arr);
        equalOrNot(arr,arr1);
    }
    public static void maximum(int[]arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void minimum(int[]arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static int Index(int[]arr,int target){
           for (int i = 0; i <arr.length ; i++) {
               if (arr[i] == target) {
                   return i;
               }
       }
           return -1;
    }
    public static boolean sumExists(int[]arr,int size,int x){
        for (int i = 0; i <size-1; i++) {
            for (int j = i+1; j <size ; j++) {
                if (arr[i] + arr[j]==x) {
                    System.out.println("Indexes of sum's are : " +i + " " +j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void sumOfElements(int[]arr){
      //  int sum = Arrays.stream(arr).sum();
//        System.out.println(sum);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];

        }
        System.out.println(sum);
    }
    public static void reverseArray(int[]arr){
        for ( int i =arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void copyElements(int[] arr){
        int[]b= Arrays.copyOfRange(arr,0,arr.length);
        System.out.println("Content of b is ");
        System.out.println(Arrays.toString(b));
    }
    public static void equalOrNot(int[]arr ,int[]arr2){
        boolean result = Arrays.equals(arr,arr2);
        if(result==true){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

}
