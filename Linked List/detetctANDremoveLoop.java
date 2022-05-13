public class detetctANDremoveLoop {
    static Node head;

    static class Node {
        int value;

        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    // O(m+n)
    public void detectandRemove(Node head) {

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }
        if (slow != fast)
            return;
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    public static void main(String[] args) {

        detetctANDremoveLoop linkedList = new detetctANDremoveLoop();

        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;

        // make loop in LinkedList
        fourth.next = second;

        System.out.println("Linked Listb after removing Loop ");
        linkedList.detectandRemove(head);

        System.out.print("LinkedList: ");
        int i = 1;
        while (i <= 4) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
            i++;
        }
  
    }
}