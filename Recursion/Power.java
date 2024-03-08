package Recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
    public static int power(int n,int y){
        if(y==0){
            return 1;
        }
        return n* power(n,y-1);
    }
}
