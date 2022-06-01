class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class basicBT {

    static final int COUNT = 10;

    static void print2DUtil(Node root, int space) {
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        print2DUtil(root.right, space);

        // Print current node after space
        // count
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.key + "\n");

        print2DUtil(root.left, space);
    }

    static void print2D(Node root) {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // root.left.left.left = new Node(8);
        // root.left.left.right = new Node(9);
        // root.left.right.left = new Node(10);
        // root.left.right.right = new Node(11);
        // root.right.left.left = new Node(12);
        // root.right.left.right = new Node(13);
        // root.right.right.left = new Node(14);
        // root.right.right.right = new Node(15);
        print2D(root);
    }
}
