package LinkedLists;

public class SinglyLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;

            }
            tail.next = newNode;
            tail = newNode;
        }

        public void insertAtHead(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            newNode.next = head;
           head = newNode;
        }
        public void insertAtIndex(int index,int data){
            Node newNode = new Node(data);
            Node temp = head;
            if(index == size()){
                insertAtEnd(data);
                return;
            }
            if(index == 0){
                insertAtHead(data);
                return;
            }
            if(index >= size() || index < 0){
                System.out.println("Invalid index");
                return;
            }
            for (int i = 1; i <=index-1 ; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
        public int getElement(int index){
            if(index > size() || index < 0) {
                System.out.println("Invalid index");
                return -1;
            }
            Node temp = head;
            for (int i = 1; i <=index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        public void displayReverse(Node temp){
            if(temp==null){
                return;
            }
                displayReverse(temp.next);
                System.out.print(temp.data + " ");
        }
        public void deleteElement(int index){
            if(index==0){
                head = head.next;
                return;
            }
            Node temp = head;
            for (int i = 1; i <=index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }
    }
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.insertAtEnd(4);
            list.insertAtEnd(5);
            list.insertAtHead(3);
            list.insertAtHead(6);
            list.display();
            System.out.println();
            list.insertAtIndex(2,10); //6->3->10->4->5
            list.insertAtIndex(0,100); // 100 6 3 4 10 5
            list.display();
            System.out.println();
            System.out.print("Size is : " +list.size());
            System.out.println();
           list.deleteElement(3);
           list.display();
            System.out.println();
            System.out.print("Size is : "+list.size());

        }
    }
