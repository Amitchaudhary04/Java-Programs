package ArraysTut;

import java.util.Arrays;
import java.util.Comparator;

public class LargestAndSmallestElement {
    public static void main(String[] args) {
        int[] array = {1, 0, 3, 8, 5};
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println(max);
    }
}