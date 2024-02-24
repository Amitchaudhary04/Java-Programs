package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum2(1234));
    }
    static int sum2(int n){
        if(n==0){
            return 0;
        }

        return sum2(n/10) + (n%10);
    }
}
