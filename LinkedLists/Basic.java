package LinkedLists;

public class Basic {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
        public static void displayReverse(Node head){
            if(head==null) return;
            displayReverse(head.next);
            System.out.print(head.data+" ");

    }
    public static int count(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next =c;
        c.next =d;
        d.next = e;
        displayReverse(a);
        System.out.println();
        System.out.println(count(a));
    }
}
