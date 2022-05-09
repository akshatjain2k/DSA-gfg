import java.lang.reflect.Method;

public class LL_implementation {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        // Method-1
        // Node head = new Node(10);
        // Node temp1 = new Node(20);
        // Node temp2 = new Node(30);
        // Node temp3 = new Node(40);

        // head.next = temp1;
        // temp1.next = temp2;
        // temp2.next = temp3;

        // Method-2
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        display(head);

    }

    static public void display(Node head) {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
