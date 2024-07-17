package LeetcodeQuestions;
import java.util.Arrays;
public class Q1800 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        System.out.println(maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums){
        int max = nums[0];
        int currMax = nums[0];
        for (int i = 1; i <nums.length; i++) {
           if(nums[i-1]<nums[i]){
               currMax = currMax + nums[i];
           }
           else{
               max = Math.max(max,currMax);
               currMax = nums[i];
           }
        }
        max = Math.max(max,currMax);
        return max;
    }
}
