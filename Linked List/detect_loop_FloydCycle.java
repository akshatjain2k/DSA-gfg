public class detect_loop_FloydCycle {

    Node head;

    static class Node {
        int value;

        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    // Floyd Cycles Algo always have 2 meeting points
    // one  = head;
    // Second = from where loop will start
    // O(m+n)
    public boolean checkLoop() {

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        detect_loop_FloydCycle linkedList = new detect_loop_FloydCycle();

        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;

        // make loop in LinkedList
        fourth.next = second;

        // printing node-value
        System.out.print("LinkedList: ");
        int i = 1;
        while (i <= 4) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
            i++;
        }
        System.out.println();
        System.out.println("We are using Floyd's Cycle Detection method");
        // call method to check loop
        boolean loop = linkedList.checkLoop();
        if (loop) {
            System.out.println("\nThere is a loop in LinkedList.");
        } else {
            System.out.println("\nThere is no loop in LinkedList.");
        }
    }
}