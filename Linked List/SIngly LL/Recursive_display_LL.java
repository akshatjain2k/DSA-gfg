public class Recursive_display_LL {
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        rprintList(head);
    }

    static void rprintList(Node head) {
        if( head == null)
            return;
        System.out.println(head.data + " ");
        rprintList(head.next );
    }
}
