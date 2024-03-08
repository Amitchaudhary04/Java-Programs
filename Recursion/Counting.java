package Recursion;

public class Counting {
    public static void main(String[] args) {
        printReverse(10);
    }
    public static void printReverse(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printReverse(n-1);
    }
}