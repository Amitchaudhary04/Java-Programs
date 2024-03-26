package SortingAlgorithms;
/*
    In this we have three questions
 */
import java.util.Arrays;
//Q1.zero ko last mein le jaana hai
public class ProblemsOnSortingAlgorithms {
    public static void main(String[] args) {
        int [] arr = {0,5,4,0,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        String [] arr2 = {"kiwi" ,"apple","pine","mango"};
        sort2(arr2);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = {2,3,4,2,5,6,5};
      find(arr3);
    }
    public static void sort(int[]arr){
        int n = arr.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //Q2. Lexographical order (sort character array)
    public static void sort2(String[]arr2){
        int n = arr2.length;
        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr2[j].compareTo(arr2[j + 1]) > 0) {
                    String temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }
    }
    //Find duplicate in an array
    public static void find(int[]arr3){
        int n = arr3.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr3[i]==arr3[j]){
                    System.out.print(arr3[j]+" ");
                }
            }
        }
    }
}
