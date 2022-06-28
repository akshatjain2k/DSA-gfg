class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
    }
}

public class floorBST {

    // TC = O(h)
    // Aux Space = O(1)
    static Node floor(Node root, int x) {
        Node res = null;
        while (root != null) {
            if (root.key == x) {
                return root;
            } else if (root.key > x) {
                root = root.left;
            } else {
                res = root;
                root = root.right;
            }
        }
        return res;
    }
}