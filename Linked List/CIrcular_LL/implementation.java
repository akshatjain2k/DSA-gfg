package CIrcular_LL;

public class implementation {
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

    void display1(Node head) {
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

    void display2(Node head) {
        if (head == null)
            return;
        System.out.println(head.data + " ");
        for (Node r = head.next; r != head; r = r.next) {
            System.out.println(r.data + " ");
        }
    }

    void display3(Node head) {
        if (head == null)
            return;
        Node r = head;
        do {
            System.out.println(r.data + " ");
            r = r.next;
        } while (r != head);
    }

    public static void main(String[] args) {
        implementation clist = new implementation();
        clist.add(5);
        clist.add(15);
        clist.add(25);
        clist.add(35);
        clist.add(45);
        System.out.println("Method- 1 of printing elements: ");
        clist.display1(head);
        System.out.println("Method- 2 of printing elements: ");
        clist.display2(head);
        System.out.println("Method- 3 of printing elements: ");
        clist.display3(head);
    }
}
