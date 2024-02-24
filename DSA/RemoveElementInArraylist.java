package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementInArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list3=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
         list3.remove(2);
        System.out.println(list3);
    }
}
