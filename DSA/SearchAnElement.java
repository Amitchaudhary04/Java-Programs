package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchAnElement {
    public static void main(String[] args) {
        ArrayList<String> list2= new ArrayList<String>(Arrays.asList("a","b","c","d"));
        for(String letter: list2){
            if(letter.equals("f")){
                System.out.println("The Element is found");
                break;
            }
        }
        int index= list2.indexOf("c");
        System.out.println("The element is found at index : " + index );
    }
}
