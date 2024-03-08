package Recursion;

public class FibonnaciNumber {
    public static void main(String[] args) {
        System.out.println(fib(25));
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibn1 = fib(n-1);
        int fibn2 = fib(n-2);
        int fib = fibn1 + fibn2;
        return fib;
    }
}
