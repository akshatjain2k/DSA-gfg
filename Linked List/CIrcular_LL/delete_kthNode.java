package CIrcular_LL;

public class delete_kthNode {
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

    public Node deletekth(Node head, int k) {
        if (head == null)
            return head;
        /*
         * if(k == 1)
         * return deleteHead;
         */
        Node curr = head;
        for (int i = 0; i < k - 2; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return null;
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
        delete_kthNode clist = new delete_kthNode();

        clist.add(5);
        clist.add(15);
        clist.add(25);
        clist.add(35);
        clist.add(45);
        System.out.println("elements: ");
        delete_kthNode.display1(head);

        clist.deletekth(head, 2);

        System.out.println("elements: ");
        delete_kthNode.display1(head);

    }
}