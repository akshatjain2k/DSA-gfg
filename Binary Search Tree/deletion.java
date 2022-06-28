class Node {
    int key;
    Node left, right;

    Node(int x) {
        key = x;
    }
}

public class deletion {

    // TC and Aux Space = O(h)
    static Node delNode(Node root, int x) {
        if (root == null) {
            return null;
        }
        if (root.key > x) {
            root.left = delNode(root.left, x);
        } else if (root.key < x) {
            root.right = delNode(root.right, x);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node succ = getSucc(root);
                root.key = succ.key;
                root.right = delNode(root.right, succ.key);
            }
        }
        return root;
    }

    // only works when the right child of the node is not null
    public static Node getSucc(Node root) {
        Node curr = root.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
}