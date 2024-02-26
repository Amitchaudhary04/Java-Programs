package Queue;

public class UsingLinkedList {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(3);
        q.add(2);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public class Queue {
            public static Node head;
            public static Node tail;

            public static boolean isEmpty() {
                return head == null & tail == null;
            }

            public static void add(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = tail = newNode;
                    return;
                }
                tail.next = newNode;
                tail = newNode;
            }

            public static int remove() {
                if (isEmpty()) {
                    System.out.println("Empty Queue");
                    return -1;
                }
                int front = head.data;
                if (tail == head) {
                    tail = head = null;
                } else {
                    head = head.next;
                }
                return front;
            }

            public static int peek() {
                if (isEmpty()) {
                    System.out.println("Empty Queue");
                    return -1;
                }
                return head.data;
            }
        }
    }
}

