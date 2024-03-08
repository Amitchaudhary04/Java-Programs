package LeetcodeQuestions;

public class Q2 {
    public static void main(String[] args) {
        int[]arr = {1,2,53,4};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
}
