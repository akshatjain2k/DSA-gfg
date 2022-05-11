public class recursiveReverse {

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

    // public void reverse(Node head) {
    // Node curr = head;
    // if (head == null) {
    // return;
    // }
    // if (head.next == null) {
    // System.out.println(head.data);
    // }
    // }

    public Node recursiveReverse(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node rest_head = recursiveReverse(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }

    public Node recRevM2(Node curr, Node prev) {
        if (curr == null)
            return prev;
        Node next = curr.next;
        curr.next = prev;

        return recRevM2(next, curr);
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


    public static void main(String[] args) {

        recursiveReverse recrev = new recursiveReverse();

        recrev.addNode(1);
        recrev.addNode(2);
        recrev.addNode(3);
        recrev.addNode(4);
        recrev.addNode(5);

        recrev.display();
        // recrev.recRevM2(curr, prev);
        recrev.display();

    }
}