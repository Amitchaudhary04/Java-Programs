package LinkedLists;

public class DoublyLinkedList {
    public static class Node {
        int data;
        Node next;
        Node previous;

        Node(int val) {
            this.data = val;
            this.next = null;
            this.previous = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static Node insertAtHead(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
        return head;
    }

    public static void display() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        Node tail = head;

        head =insertAtHead(head,12);
        head = insertAtHead(head,13);
        display();

    }
}
