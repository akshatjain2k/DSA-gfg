package Doubly_LL;

public class insert_at_begin {
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
        // Create a new node
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            // Both head and tail will point to newNode
            head = tail = newNode;
            // head's previous will point to null
            head.previous = null;
            // tail's next will point to null, as it is the last node of the list
            tail.next = null;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode's previous will point to tail
            newNode.previous = tail;
            // newNode will become new tail
            tail = newNode;
            // As it is last node, tail's next will point to null
            tail.next = null;
        }
    }

    public Node insertF(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.previous = tail.next = null;
        } else {
            head.previous = newNode;
            newNode.next = head;
            newNode.previous = null;
            head = newNode;
        }
        return newNode;

    }

    // Display DLL
    public static void display() {
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
        insert_at_begin dll = new insert_at_begin();
        dll.addNode(1);
        dll.addNode(2);
        dll.addNode(3);
        dll.addNode(4);
        dll.addNode(5);
        dll.display();
        System.out.println();
        dll.insertF(2);
        dll.display();
    }
}
