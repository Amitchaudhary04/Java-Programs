package LeetcodeQuestions;

public class Patterns {
    public static void main(String[] args) {
        pattern4(5);

    }
    public static void pattern1(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for (int i = 0; i <=n; i++) {
            for (int j = i+1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <=i+1 ; j++) {
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
    }
}
