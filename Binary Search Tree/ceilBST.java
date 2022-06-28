class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
    }
}

public class ceilBST {

    // TC = O(h)
    // Aux Space = O(1)
    static Node ceil(Node root, int x) {
        Node res = null;
        while (root != null) {
            if (root.key == x) {
                return root;
            } else if (root.key < x) {
                root = root.right;
            } else {
                res = root;
                root = root.left;
            }
        }
        return res;
    }
}
