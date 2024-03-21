package CodeforcesSolutions;
import java.util.Scanner;
public class Problem411A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (isComplexPassword(password)) {
            System.out.println("Correct");
        } else {
            System.out.println("Too weak");
        }
    }
    public static boolean isComplexPassword(String password) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        return password.length() >= 5 && hasUppercase && hasLowercase && hasDigit;
    }
}
