class Node {
    int key;
    Node left, right;

    Node(int x) {
        key = x;
    }
}

public class searchEle {
    // TC = O(h), h--> height
    // Aux Space = O(h)
    // Recursive
    static boolean search(Node root, int x) {
        if (root == null) {
            return false;
        } else if (root.key == x) {
            return true;
        } else if (root.key > x) {
            return search(root.left, x);
        } else {
            return search(root.right, x);
        }
    }

    // TC = O(h), h--> height
    // Aux Space = O(1  )
    // Iterative
    static boolean searchIt(Node root, int x) {
        while (root != null) {
            if (root.key == x) {
                return true;
            } else if (root.key > x) {
                root = root.left;
            } else {
                root = root.left;
            }
        }
        return false;
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

        System.out.println(search(root, 80));
    }
}
