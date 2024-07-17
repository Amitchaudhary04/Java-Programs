package LeetcodeQuestions;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(power(20));
    }

    public static boolean power(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        } else if (n % 2 == 0) {
            n /= 2;

        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}
