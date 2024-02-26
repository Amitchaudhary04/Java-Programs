package Queue;
import java.util.*;
import java.util.Queue;

public class UsingFrameWork {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(4);
        q.add(3);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
