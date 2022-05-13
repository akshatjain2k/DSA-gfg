public class palindrome {
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

    boolean isPalindrome(Node head) {
        if (head == null)
            return true;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node rev = reverseList(slow.next);

        Node curr = head;
        while (rev != null) {
            if (rev.data != curr.data) {
                return false;
            }
            rev = rev.next;
            curr = curr.next;
        }
        return rue;
    }
}
/*
 * Method-1 use stack to push and then pop out and compare if same then
 * palindrome otherwise not
 */