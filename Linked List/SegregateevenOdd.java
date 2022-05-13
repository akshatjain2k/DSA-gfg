public class SegregateevenOdd {

    static Node head;

    static class Node {
        int data;

        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

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

    public Node segragate(Node head) {
        // eS = even start, eE = even end, oS = odd start, oE = odd end
        Node eS = null, eE = null, oS = null, oE = null;

        for (Node curr = head; curr != null; curr = curr.next) {
            int x = curr.data;
            if (x % 2 == 0) {
                if (eS == null) {
                    eS = curr;
                    eE = eS;
                } else {
                    eS.next = curr;
                    eE = eE.next;
                }
            } else {
                {
                    if (oS == null) {
                        oS = curr;
                        oE = oS;
                    } else {
                        oS.next = curr;
                        oE = oE.next;
                    }
                }
            }
        }

        if (oS == null || eS == null) {
            return head;
        }
        eE.next = oS;
        oE.next = null;

        return eS;
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

    public static void main(String[] args) {

        SegregateevenOdd sList = new SegregateevenOdd();

        sList.addNode(17);
        sList.addNode(15);
        sList.addNode(8);
        sList.addNode(12);
        sList.addNode(10);
        sList.addNode(5);
        sList.addNode(4);

        sList.display();

        sList.segragate(head);

        sList.display();

    }
}