public class Search_element {
    static Node head = null;
    static Node tail = null;

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    /// Start Here(Iterative Approach)

    static int searchele(Node head, int target) {
        int pos = 1;
        Node curr = head;
        while (curr.next != null) {
            if (curr.data == target)
                return pos;
            else {
                pos++;
                curr = curr.next;
            }
        }

        return -1;
    }

    /// End Here
    /// Start Here(Recursive Approach)
    static int searcheleRecursively(Node head, int target) {
        int pos = 1;
        if (head == null) {
            return -1;
        }
        if (head.data == target) {
            return 1;
        } else {
            int res = searcheleRecursively(head.next, target);
            if (res == -1) {
                return -1;
            } else {
                return (res + 1);
            }
        }
    }
    /// End Here

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
        Search_element se = new Search_element();
        se.inserAt1st(60);
        se.inserAt1st(50);
        se.inserAt1st(40);
        se.inserAt1st(30);
        se.inserAt1st(20);
        se.inserAt1st(10);

        se.display(head);
        System.out.println(se.searchele(head, 40));
        System.out.println(se.searcheleRecursively(head, 40));

    }

}
