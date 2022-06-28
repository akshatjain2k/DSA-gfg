class Node {
    int key;
    Node left, right;

    Node(int x) {
        key = x;
    }
}

public class insertion {
    // TC = O(h), h--> height
    // Aux Space = O(h)
    // Recursive
    static Node insert(Node root, int x) {
        Node temp = new Node(x);
        if (root == null) {
            return temp;
        }
        if (root.key > x) {
            root.left = insert(root.left, x);
        } else if (root.key > x) {
            root.right = insert(root.right, x);
        }
        return root;
    }

    static Node insertIt(Node root, int x) {
        Node temp = new Node(x);
        Node parent = null, curr = root;
        while (curr != null) {
            parent = curr;
            if (curr.key > x) {
                curr = curr.left;
            } else if (curr.key < x) {
                curr = curr.right;
            } else {
                return root;
            }
        }

        if (parent == null) {
            return temp;
        }
        if (parent.key > x) {
            parent.left = temp;
        } else {
            parent.right = temp;
        }
        return root;
    }

    public static void main(String[] args) {
        searchEle bt = new searchEle();
        Node root = new Node(15);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.right.left = new Node(18);
        root.right.right = new Node(80);
        root.right.left.left = new Node(16);

        insertIt(root, 70);
    }
}
