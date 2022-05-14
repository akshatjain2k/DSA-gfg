
class LinkedListimplementation {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class MyStack {
        Node head;
        int sz;

        MyStack() {
            head = null;
            sz = 0;
        }

        int size() {
            return sz;
        }

        boolean isEmpty() {
            return (head == null);
        }

        public void push(int x) {
            Node newNode = new Node(x);
            newNode.next = head;
            head = newNode;
            sz++;
        }

        int pop() {
            if (head == null) {
                return Integer.MAX_VALUE;
            }
            int res = head.data;
            head = head.next;
            sz--;
            return res;
        }

        int peek() {
            if (head == null) {
                return Integer.MAX_VALUE;
            }
            return head.data;
        }

        public static void main(String[] args) {
            LinkedListimplementation ll = new LinkedListimplementation();
            // ll.push(5);
        }

    }
}