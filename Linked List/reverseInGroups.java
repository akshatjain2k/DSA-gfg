// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class reverseInGroups {
//     public static Node head = null;
//     public Node tail = null;

//     public void addNode(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//         } else {
//             tail.next = newNode;
//             tail = newNode;
//         }
//     }

//     // Recursive Approach
//     static Node revInGrp(Node head, int k) {
//         Node curr = head;
//         Node prev = null;
//         Node next = null;

//         int count = 0;
//         while (curr != null && count < k) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//             count++;
//         }
//         if (next != null) {
//             Node rest_head = revInGrp(next, k);
//             head.next = rest_head;
//         }
//         return prev;
//     }

//     // Iterstive Approach
//     static Node recrevInGrp(Node head, int k) {
//         Node curr = head;
//         Node prevFirst = null;
//         boolean isFirstPass = true;
//         while (curr != null) {
//             int count = 0;
//             Node first = curr;
//             Node prev = null;
//             while (curr != null && count < k) {
//                 Node next = curr.next;
//                 curr.next = prev;
//                 prev = curr;
//                 curr = next;
//                 count++;
//             }
//             if (isFirstPass) {
//                 head = prev;
//                 isFirstPass = false;
//             } else {
//                 prevFirst.next = prev;
//             }
//             prevFirst = first;
//         }
//         return head;
//     }

//     public void display() {
//         Node current = head;

//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         System.out.println("Nodes of singly linked list: ");
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         reverseInGroups sList = new reverseInGroups();

//         sList.addNode(1);
//         sList.addNode(2);
//         sList.addNode(3);
//         sList.addNode(4);
//         sList.addNode(5);

//         sList.display();
//         sList.recrevInGrp(head, 3);
//         sList.display();

//     }
// }
