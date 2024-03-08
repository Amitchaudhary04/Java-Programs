package BitManipulationTechniques.Questions;

public class EvenOdd {
    public static void main(String[] args) {
        evenOdd(3);
        evenOdd(12);
        evenOdd(108);
    }
    public static void evenOdd(long n){
        long bitMask = n&1;
        if(bitMask==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
