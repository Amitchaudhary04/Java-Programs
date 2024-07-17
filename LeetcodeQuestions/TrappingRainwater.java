package LeetcodeQuestions;

import java.util.Scanner;

public class TrappingRainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] height = new int[k];

        for (int i = 0; i < k; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println(trap(height));
    }
    public static int trap(int[] height){
        int n = height.length;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans+= Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return ans;
    }
}
