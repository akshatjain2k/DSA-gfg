public class insert_at_given_pos {
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

    static Node insertPos(Node head, int pos, int x) {
        Node newNode = new Node(x);
        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }

        Node curr = head;
        for (int i = 1; i <=  pos - 2 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null)
            return head;
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

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
        insert_at_given_pos ip = new insert_at_given_pos();
        ip.inserAt1st(50);
        ip.inserAt1st(40);
        ip.inserAt1st(30);
        ip.inserAt1st(20);
        ip.inserAt1st(10);

        ip.display(head);

        ip.insertPos(head, 4, 45);

        ip.display(head);
    }
}
