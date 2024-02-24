package Recursion;

public class OccurenceOfDigits {
   public  static int count(int n){
       return helper2(n,0);

    }
    public static int helper2(int n,int digits){
       if(n==0){
           return digits;
       }
        int rem = n%10;
        if(rem ==0){
            return helper2(n/10,digits+1);
        }
        return helper2(n/10,digits);
    }

    public static void main(String[] args) {
        System.out.println(count(1230));
    }
}
