package CIrcular_LL;

public class insert_at_last {

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

    public Node insertatLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;

        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.next = head;
        }
        return newNode;
    }

    // Opmtimize Solution
    // O(1)

    public Node efficientSolu(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;

        } else {
            newNode.next = head.next;
            head.next = newNode;
            int t = newNode.data;
            newNode.data = head.data;
            head.data = t;
            return newNode;
        }

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
        insert_at_last clist = new insert_at_last();

        clist.add(5);
        clist.add(15);
        clist.add(25);
        clist.add(35);
        clist.add(45);
        System.out.println("elements: ");
        insert_at_last.display1(head);

        clist.efficientSolu(12);

        System.out.println("elements: ");
        insert_at_last.display1(head);

    }
}
