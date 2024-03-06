package BitManipulationTechniques;

public class BasicOperators {
    public static void main(String[] args) {

        //Bitwise And
        System.out.println(5 & 6);

        //Bitwise Or
        System.out.println(5 | 6);

        //Bitwise XOR
        System.out.println(5 ^ 6);

        //Binary One`s Complement
        //~0 = -1
        System.out.println(~5);

        //Binary left shift
        //Formula to calculate : a<<b = a * 2^b
        System.out.println(5<<2);

        //Binary right shift
        //Formula to calculate : a>>b = a / 2^b;
        System.out.println(6>>1);
    }
}
