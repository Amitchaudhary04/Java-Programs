package LeetcodeQuestions;

public class ReturnSingleElement {
    public static void main(String[] args) {
        int[] arr = {10,10,20,30,30};
        int len = arr.length;
        element(arr, len);
    }
    public static void element(int[] arr,int n){
        int ans = -1;
        for (int i = 0; i < arr.length-1 ; i++) {
                if(arr[i]!=arr[i+1]){
                   ans=arr[i];
                }
            }
            if(arr[n-2] !=arr[n-1]){
                ans = arr[n-1];
        }
        System.out.println(ans);
    }
}
