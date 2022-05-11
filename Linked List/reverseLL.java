import java.util.ArrayList;

public class reverseLL {
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

    public Node reversse(Node head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (Node curr = head; curr != null; curr = curr.next) {
            arr.add(curr.data);
        }
        for (Node curr = head; curr != null; curr = curr.next) {
            curr.data = arr.remove(arr.size() - 1);
        }
        return head;
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

    // Optimize Solution

    public Node efficientreverse(Node head) {

        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {

        reverseLL revList = new reverseLL();

        revList.addNode(1);
        revList.addNode(2);
        revList.addNode(3);
        revList.addNode(4);
        revList.addNode(5);

        revList.display();
        revList.efficientreverse(head);
        revList.display();

    }
}