package Doubly_LL;

public class delete_last {
    class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data){
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

    public static Node deleteLast() {
        Node curr = head;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        while(curr.next != null){
            curr = curr.next;
        }
        curr.previous.next = null;

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

        delete_last dList = new delete_last();
        // Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);
        dList.display();
        System.out.println();
        dList.deleteLast();
        dList.display();
    }

}
