package Patterns;
import java.util.*;
public class pattern10 {
    public static void main(String[] args) {

            int row, i, j, space = 1;
            System.out.print("Enter the number of rows you want to print: ");
            Scanner sc = new Scanner(System.in);
            row = sc.nextInt();
            space = row - 1;
            j = 1;
            while (j <= row) {
                i = 1;
                while (i <= space) {
                    System.out.print(" ");
                    i++;
                }
                space--;

                i = 1;
                while (i <= 2 * j - 1) {
                    System.out.print("*");
                    i++;
                }
                System.out.println("");
                j++;
            }
            space = 1;
            j = 1;
            while (j <= row - 1) {
                i = 1;
                while (i <= space) {
                    System.out.print(" ");
                    i++;
                }
                space++;

                i = 1;
                while (i <= 2 * (row - j) - 1) {
                    System.out.print("*");
                    i++;
                }
                System.out.println("");
                j++;
            }
        }
    }
