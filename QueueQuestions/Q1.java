// Implementation of Stack using collections
package QueueQuestions;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>() ;
        q.add(4);
        q.add(5);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
