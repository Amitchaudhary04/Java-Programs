package BitManipulationTechniques.Questions;

import java.sql.SQLOutput;

public class Swap {
    public static void main(String[] args) {
        int a = 3;
        int b= 7;
        System.out.println("Values Before swap = " +"a : "+a +" , "+"b : " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Values After swap = " +"a : "+a +" , "+"b : " + b );
    }
}
