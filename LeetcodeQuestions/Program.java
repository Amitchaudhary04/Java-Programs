package LeetcodeQuestions;

public class Program {
    public static void main(String[] args) {
        System.out.println(reverse(13));
    }
    public static int reverse(int num){
        int revNum = 0;
        while(num>0){
            revNum = revNum *10 + num % 10;
            num  = num/10;
        }
        return revNum;
    }
}
