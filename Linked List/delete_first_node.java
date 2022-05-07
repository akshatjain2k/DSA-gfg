public class delete_first_node {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    static void inserAt1st(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    public static void delHead() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else {
            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;
            }
        }
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

    public static void main(String[] args) {
        delete_first_node dn = new delete_first_node();

        dn.inserAt1st(40);
        dn.inserAt1st(30);
        dn.inserAt1st(20);
        dn.inserAt1st(10);

        dn.display(head);

        dn.delHead();

        dn.display(head);

    }
}
