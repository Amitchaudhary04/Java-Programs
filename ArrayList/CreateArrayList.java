package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0,4);
        a.add(1,2);
        a.add(2,5);
        System.out.println(a.get(0));
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
