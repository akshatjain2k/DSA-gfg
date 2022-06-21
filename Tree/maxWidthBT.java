import java.util.Queue;
import java.util.LinkedList;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

// Tc = O(n) / Theta(n)
// Sc = Theta(Width) \  O(n)
public class maxWidthBT {
    static int maxWidth(Node root) {
        if (root == null)
            return 0;
        Queue<Node> q = new LinkedList<Node>();
        ((LinkedList<Node>) q).push(root);
        int res = 0;
        while (q.isEmpty() == false) {
            int count = q.size();
            res = Math.max(res, count);
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);

                if (curr.right != null)
                    q.add(curr.right);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println(maxWidth(root));
    }
}
