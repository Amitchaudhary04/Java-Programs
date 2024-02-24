package Recursion;

import java.util.Random;
import java.util.*;
public class SearchTargetElementInArray {
    public static void main(String[] args) {
        int []arr =new int[]{1,2,3,4,5};
        System.out.println(Element(arr,4,0));
        System.out.println(findIndex(arr,4,0));


    }
    static boolean Element(int[] arr,int target,int index){
        if(index== arr.length){
            return false;
        }
        return arr[index]==target || Element(arr,target,index+1);
    }
    static int findIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        else if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr,target,index+1);
        }
    }
}
