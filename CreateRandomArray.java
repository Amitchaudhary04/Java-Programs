import java.util.Arrays;
import java.util.Random;

public class CreateRandomArray {
    public static void main(String[] args) {
    int []array={};
        System.out.println(Arrays.toString(array));
}
     static int getRandomArray(int []array){
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
}
    }