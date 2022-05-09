package Doubly_LL;

public class delete_head {
    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node head;
    Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public static Node deleteFirst() {
        Node curr = head;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        } else {
            head = head.next;
            head.previous = null;
        }
        return head;
    }

    public void display() {
        Node current = head;
        if (head == null) {
            return;
        }
        while (current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        delete_head dList = new delete_head();
        // Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);
        dList.display();
        System.out.println();
        dList.deleteFirst();
        dList.display();
    }

}
