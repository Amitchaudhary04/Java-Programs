package LeetcodeQuestions;

public class q {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 4;
        System.out.println(sorted(arr,0));
    }
    public static int sorted(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;

        while(start<=end){
            if(arr[0]==target){
                return arr[0];
            }
            if(arr[arr.length-1]==target){
                return arr[arr.length-1];
            }
            else if(target>=arr[start] && target<arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid -1;
            }if(target<arr[mid] && target <=arr[end]){
                start = mid-1;
            }else{
                end  = mid+1;
            }
            return mid;
        }
        return -1;
    }
}
