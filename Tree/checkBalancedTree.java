class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

// |Left subtree - right subtree| < 2 ---> Balanced Tree
public class checkBalancedTree {
    static int height(Node root) {
        if (root == null)
            return 0;
        else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

    // Naive Solution
    // Tc = O(n^2) --- height- O(n) * height - O(n-1)
    static boolean isBalanced(Node root) {
        if (root == null)
            return true;
        int lh = height(root.left);
        int rh = height(root.right);

        return (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }

    // Efficient Solution
    // TC - O(n)
    static int efficientBalanced(Node root) {
        if (root == null)
            return 0;
        int lh = efficientBalanced(root.left);
        if (lh == -1)
            return -1;
        int rh = efficientBalanced(root.right);
        if (rh == -1)
            return -1;
        if (Math.abs(lh - rh) > 1)
            return -1;
        else {
            return Math.max(lh, rh) + 1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.right.left = new Node(10);
        root.right.right = new Node(2);
        System.out.println(efficientBalanced(root));
    }
}
