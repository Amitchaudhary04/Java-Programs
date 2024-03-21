package InterviewsQuestionsTopicWise.Arrays;
import java.util.*;
public class MaximumSubArray {
    //Kadane's Algorithm
    public static void main(String[] args) {
         int[] a= {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum contiguous sum is : "+maxSubArraySum(a));
    }
    public static int maxSubArraySum(int[]a){
        int size = a.length;
        int maximumSoFar = Integer.MIN_VALUE;
        int maxEnding = 0;
        for (int i = 0; i < size ; i++) {
            maxEnding = maxEnding + a[i];
            if(maximumSoFar < maxEnding){
                maximumSoFar = maxEnding;
            }
            if(maxEnding<0){
                maxEnding = 0;
            }
        }
        return maximumSoFar;
    }
}
