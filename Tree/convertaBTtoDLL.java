class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }

}

// make Dll with using Inorder Traversal
// Tc = O(n)
// Sc = O(h)
public class convertaBTtoDLL {
    static Node prev = null;

    static Node conversionBttoDll(Node root) {
        if (root == null)
            return root;
        Node head = conversionBttoDll(root.left);
        if (prev == null)
            head = root;
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        conversionBttoDll(root.right);
        return head;
    }

    public static void main(String[] args) {
        Node root = new Node(21);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(30);
        root.right.right = new Node(35);
        System.out.println(conversionBttoDll(root));
    }
}
