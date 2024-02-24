// factorial using recursion
public class Factorial {
    public static void main(String[] args) {
        long n=5;
        System.out.println("Factorial is : "+ fact(n,1));
    }
    public static long fact(long n, long ans){
        if(n==0||n==1){
            return ans;
        }
        return fact(n-1,ans*n);
    }
}
