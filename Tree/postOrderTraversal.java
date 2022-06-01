class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

// TC = O(n)
// SC = O(h), h--height
public class postOrderTraversal {

    static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        postOrder(root);
    }
}
