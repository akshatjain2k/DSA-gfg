package Circular_Doubly_LL;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

    public class middle_of_LL {

        static Node findMiddle(Node head) {
            int count = 0;
            if (head == null)
                return null;
            Node curr;
            for (curr  = head; curr != null; curr = curr.next) {
                count++;
            }
            curr=head; 
            for (int i = 0; i < count / 2; i++) {
                curr = curr.next;
            }
            System.out.println(curr.data);

            return head;
        }

        // optimize solution
        // use variable slow and fast
        // slow moves 1 node at a timr
        // fast mooves 2
        // when fast at the end
        // slow will be at middle element

        static void efficientSol(Node head) {
            if (head == null) {
                return;
            }
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println(slow.data);

        }

        public static Node insertEnd(Node head, int x) {
            Node newNode = new Node(x);
            if (head == null) {
                return newNode;
            }
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;

            return head;
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
            Node head = null;
            head = insertEnd(head, 10);
            head = insertEnd(head, 20);
            head = insertEnd(head, 30);
            head = insertEnd(head, 40);
            head = insertEnd(head, 50);

            efficientSol(head);
            findMiddle(head);
            display(head);

        }
    }
}
