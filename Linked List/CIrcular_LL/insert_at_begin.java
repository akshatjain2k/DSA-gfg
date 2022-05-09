package CIrcular_LL;

public class insert_at_begin {

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

    public Node insertatFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;

        }
        // Putting newNode between 1st and 2nd elemnt and then swapping 1st and 2nd

        else {
            newNode.next = head.next;
            head.next = newNode;
            int t = head.data;
            head.data = newNode.data;
            newNode.data = t;
        }
        return newNode;
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
        insert_at_begin clist = new insert_at_begin();

        clist.add(5);
        clist.add(15);
        clist.add(25);
        clist.add(35);
        clist.add(45);
        System.out.println("elements: ");
        insert_at_begin.display1(head);

        clist.insertatFirst(12);

        System.out.println("elements: ");
        insert_at_begin.display1(head);

    }
}
