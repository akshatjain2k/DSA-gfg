package Circular_Doubly_LL;
public class sorted_insert {

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

    public Node insertinSorted(Node head, int x) {
        Node newNode = new Node(x);
        Node curr = head;
        if (head == null) {
            return newNode;
        }
        if (x < head.data) {
            newNode.next = head;
            return newNode;
        } else{
            while (curr.next != null && curr.next.data < x) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
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
        sorted_insert clist = new sorted_insert();

        clist.add(5);
        clist.add(15);
        clist.add(25);
        clist.add(35);
        clist.add(45);
        System.out.println("elements: ");
        sorted_insert.display1(head);

        clist.insertinSorted(head, 20);

        System.out.println("elements: ");
        sorted_insert.display1(head);

    }
}
