package LinkedLists;

public class SinglyLinkedList {
    class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;

    public void insertAtHead(int data){
        node newNode = new node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void insertAtTail(int data){
        node newNode = new node(data);
        size++;
        if(head ==null){
            head = tail =newNode;
            return;
        }
        tail.next =newNode;
        tail = newNode;
    }
    public void insertAtMiddle(int index ,int data){
        if(index == 0){
            insertAtHead(data);
            return;
        }
        node newNode = new node(data);
        size++;
        node temp = head;
        int i = 0;
        while(i<index -1){
            temp  = temp.next;
            i++;
        }
        newNode.next= temp.next;
        temp.next = newNode;
    }
    public void display(){

        if(head ==null){
            System.out.println("Linked List is empty");
            return;
        }
        node temp =head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int removeAtFirst(){
        if(size ==0){
            System.out.println("Linked List is Empty ");
        } else if (size ==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("Linked List is empty ");
            return Integer.MIN_VALUE;
        }
       else if(size==1){
           int val = head.data;
           head = head.next;
           size = 0;
           return val;
        }
       node previous = head;
        for (int i = 0; i <size-2; i++) {
            previous = previous.next;
        }
       int val = previous.next.data;
        previous.next = null;
        tail = previous;
        size--;
        return val;
    }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();

        sl.insertAtHead(1);

        sl.insertAtHead(2);

        sl.insertAtTail(3);

        sl.insertAtTail(4);

        sl.insertAtMiddle(2,5);

        sl.display();
        System.out.println(sl.size);
        sl.removeAtFirst();
        sl.display();
        sl.removeLast();
        sl.display();

    }
}
