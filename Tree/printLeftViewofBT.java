class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class printLeftViewofBT {
    
    // Tc - O(n) or Theta(n)
    // Aux Space - Theta(h)
    static int maxlevel = 0;

    static void leftViewPrint(Node root, int level) {
        
        if (root == null)
            return;
        if (maxlevel < level) {
            System.out.print(root.key+  " ");
            maxlevel = level;
        }
        leftViewPrint(root.left, level + 1);
        leftViewPrint(root.right, level + 1);
    }

    static void printLeftView(Node root) {
        leftViewPrint(root, 1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        printLeftView(root);
    }
}
