import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class levelorderTraversal {
    // TC = O(n) or Theta(n)
    // SC = O(n) or Theta(w) -- where w is width of binary tree
    static void printlevel(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.isEmpty() == false) {
            Node curr = q.poll();
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
            System.out.print(curr.key + " ");
        }

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);

        root.right = new Node(30);
        root.right.right = new Node(6);

        printlevel(root);

    }

}