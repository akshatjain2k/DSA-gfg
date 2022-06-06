class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class childrenSum {

    // Tc = O(n)
    // Aux Spa = O(h)
    static boolean childSum(Node root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        int sum = 0;
        if (root.left != null)
            sum += root.left.key;
        if (root.right != null)
            sum += root.right.key;

        return (root.key == sum && childSum(root.left) && childSum(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.right.left = new Node(10);
        root.right.right = new Node(2);
        System.out.println(childSum(root));
    }
}