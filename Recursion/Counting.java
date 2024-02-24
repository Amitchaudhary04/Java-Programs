package Recursion;

public class Counting {
    public static void main(String[] args) {
        System.out.println( "Factorial is : "+printCounting(10));

    }
    static int printCounting(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return (n* printCounting(n-1));
        }
    }

}
