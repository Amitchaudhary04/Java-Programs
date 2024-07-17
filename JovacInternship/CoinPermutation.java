package JovacInternship;

public class CoinPermutation {
    public static void main(String[] args) {


        int[] arr = {2, 3, 5};
        int target = 10;
        coin(arr,0,target,"",0);
    }
    public static void coin(int[] arr,int sum,int target,String ans,int si){
        if(sum==target){
            System.out.println(ans);
            return;
        }
        if(sum>target){
            return;
        }
        for (int i = si; i < arr.length ; i++) {
            coin(arr,sum+arr[i],target,ans+arr[i],i);
        }
    }
}
