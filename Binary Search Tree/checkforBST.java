class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
    }
}

public class checkforBST {

    // Efficient Solution
    static boolean isBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        return (root.data > min && root.data < max &&
                isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max));
    }

    // Efficient Solution(Inorder Traversal)
    // O(n)
    // O(h)
    static int prev = Integer.MIN_VALUE;

    static boolean isBSTeffiie(Node root) {
        if (root == null) {
            return true;
        }
        if (isBSTeffiie(root.left) == false) {
            return false;
        }
        if (root.data <= prev) {
            return false;
        }
        prev = root.data;
        return isBSTeffiie(root.right);
    }

    public static void main(String[] args) {

    }
}
