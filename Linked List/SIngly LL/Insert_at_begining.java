public class Insert_at_begining{
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

    void inserAt1st(int x) {
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

     public void display(Node head) {
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
        Insert_at_begining al = new Insert_at_begining();
        al.inserAt1st(60);
        al.inserAt1st(50);
        al.inserAt1st(40);
        al.inserAt1st(30);
        al.inserAt1st(20);
        al.inserAt1st(10);

        al.display(head);
    }

}