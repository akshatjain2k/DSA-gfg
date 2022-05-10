package Circular_Doubly_LL;

public class insert_at_head {

    class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public static Node head = null;
    public Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
        }
    }

    public Node insertHead(int data) {
        Node newNode = new Node(data);
        Node curr = head;
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
        }
        return newNode;
    }

    static void display1(Node head) {
        Node curr = head;
        if (head == null) {
            System.out.println("Empty List");
            return;
        } else {
            System.out.println("Circular Doubly Linked List: ");
            do {
                System.out.println("" + curr.data);
                curr = curr.next;
            } while (curr != head);
        }
    }

    public static void main(String[] args) {
        insert_at_head clist = new insert_at_head();

        clist.add(5);
        clist.add(15);
        clist.add(25);
        clist.add(35);
        clist.add(45);
        System.out.println("elements: ");
        insert_at_head.display1(head);

        clist.insertHead(12);

        System.out.println("elements: ");
        insert_at_head.display1(head);

    }
}
