package DSA;

import java.util.*;

public class ArrayProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many days' temperature? ");
        int numdays = sc.nextInt();
        int[] temps = new int[numdays];
        //record temperature
        int sum = 0;
        for (int i = 0; i < numdays; i++) {
            System.out.println("Day " + (i+1) + " 's high temp : ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
        double average = sum / numdays;
        // count days above average
        int above=0;
        for (int i = 0; i < temps.length ; i++) {
            if(temps[i]>average){
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println("Above days are : "+ above);

    }
}
