class Node {
    int key;
    Node right;
    Node left;

    Node(int k) {
        key = k;
    }
}

public class maxinBT {

    // Tc = O(n)
    // Aux space = O(h)
    int getMax(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;  // means for leaf values it returns -infinite
        return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(20);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        maxinBT mx = new maxinBT();
        System.out.println(mx.getMax(root));
    }
}
