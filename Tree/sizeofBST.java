class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class sizeofBST {

    // Method-1
    // TC = O(n)
    // Aux Space = O(h)
    static int getSize(Node root) {
        if (root == null)
            return 0;
        return 1 + getSize(root.left) + getSize(root.right);
    }
    // Method -2
    // we can use level order traversal with a count varible in loop
    // TC will be O(n)
    // Aux Space will bw O(w) -- width

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println(getSize(root));
    }
}
