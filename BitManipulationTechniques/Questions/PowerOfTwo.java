package BitManipulationTechniques.Questions;

public class PowerOfTwo {
    public static void main(String[] args) {
        check(2);
    }
    public static void check(int n){
        if((n & (n-1))==0){
            System.out.println("True");
            return;
        }
        else{
            System.out.println("false");
        }
    }
}
