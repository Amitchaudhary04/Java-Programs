package Recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum = n + sum(n-1);
        return sum;
    }
}