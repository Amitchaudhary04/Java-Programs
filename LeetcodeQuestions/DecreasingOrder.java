package LeetcodeQuestions;

public class DecreasingOrder {
    public static void main(String[] args) {
        int n=1;
        reverseOrder(n);
    }
    public static int reverseOrder(int n){
       if(n==51){
           return 0 ;
       }
        System.out.println(n);
       reverseOrder(n+1);
           return 0;
    }

}
