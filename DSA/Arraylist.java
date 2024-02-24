package DSA;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
//        ArrayList<Integer> sd = new ArrayList<Integer>();
//        sd.add(12);
//        sd.add(13);
//        sd.add(15);
//        System.out.println(sd);
        ArrayList<String> stringsList = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
//        stringsList.add(0, "a");
//        stringsList.add(1, "v");
//        stringsList.add(2, "c");
//        stringsList.add(3, "d"); //get an element from arrayList
//        System.out.println(stringsList.get(3));
        Iterator<String> iterator = stringsList.iterator();
        // traversal of an arrayList
        while (iterator.hasNext()) {
            String letter = iterator.next();
            System.out.println(letter);

        }
    }
}
