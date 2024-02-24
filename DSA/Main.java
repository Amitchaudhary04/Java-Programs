package DSA;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TwoDimensionArray sda=new TwoDimensionArray(3,3);
        sda.insert(0,0,10);
        sda.insert(0,1,21);
        sda.insert(1,0,23);
        sda.insert(2,0,40);
        sda.searchElement(23);
        sda.deleteElement(2,0);
        System.out.println(Arrays.deepToString(sda.arr2));
    }
}
