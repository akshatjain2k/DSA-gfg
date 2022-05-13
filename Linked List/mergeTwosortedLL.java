public class mergeTwosortedLL {

    static Node head;

    static class Node {
        int data;

        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

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

    public Node Sortedmerge(Node a, Node b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        Node head = null, tail = null;
        if (a.data <= b.data) {
            head = tail = a;
            a = a.next;
        } else {
            head = tail = b;
            b = b.next;
        }

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return head;

    }

    public static void main(String[] args) {

    }
}
