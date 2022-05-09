package CIrcular_LL;

import java.text.BreakIterator;

public class delete_head {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node head = null;
    public Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = null;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public Node deleteHead() {
        if (head == null) {
            return null;

        }
        if (head.next == head) {
            return null;

        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;
    }

    // Efficient Solution
    public Node efficientSolu() {
        if (head == null) {
            return null;

        }
        if (head.next == head) {
            return null;

        }
        // Copy 2nd element data in first and then connect 1 with 3rd
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    static void display1(Node head) {
        Node curr = head;
        if (head == null) {
            System.out.println("Empty List");
            return;
        } else {
            System.out.println("Circular Linked List: ");
            do {
                System.out.println("" + curr.data);
                curr = curr.next;
            } while (curr != head);
        }
    }

    public static void main(String[] args) {
        delete_head clist = new delete_head();

        clist.add(5);
        clist.add(15);
        clist.add(25);
        clist.add(35);
        clist.add(45);
        System.out.println("elements: ");
        delete_head.display1(head);

        clist.efficientSolu();

        System.out.println("elements: ");
        delete_head.display1(head);

    }
}
