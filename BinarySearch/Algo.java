package BinarySearch;

public class Algo {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(search(arr,6));
    }
    public static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
