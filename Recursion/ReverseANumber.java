package Recursion;

public class ReverseANumber {
       static int reversed(int n){
           int digits = (int)(Math.log10(n)) + 1;
           return helper(n, digits);
       }
       public static int helper(int n, int digits){
           if(n%10==n){
               return n;
           }
           int rem = n%10;
           return rem * (int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
       }
       static boolean palli(int n ){
           return(n ==reversed(n));
       }

    public static void main(String[] args) {
        System.out.println(palli(151));

    }
}