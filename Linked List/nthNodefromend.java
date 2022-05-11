import javax.swing.plaf.SliderUI;

public class nthNodefromend {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printfromend(Node head, int n) {
        int len = 0;
        for (Node curr = head; curr != null; curr = curr.next) {
            len++;
        }
        if (len < n) {
            return;
        }
        Node curr = head;
        for (int i = 1; i < len - n + 1; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
    /*
     * Optimize Solution
     * steps
     * 1. Move 'first' n positions ahead.
     * 2. Start 'second' pointer from head
     * 3. Move both 'first' and 'second' at sme speed. when 'first' reaches NULL,
     * second reaches the required node
     */

    static void efficientSolu(Node head, int n) {
        if (head == null)
            return;
        Node first = head;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        Node second = head;
        while (first != null) {
            second = second.next;
            first = first.next;
        }
        System.out.println(second.data);
    }

    public static void main(String[] args) {

        nthNodefromend sList = new nthNodefromend();

        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);

        sList.display();

        sList.efficientSolu(head, 2);
        sList.printfromend(head, 2);
    }
}