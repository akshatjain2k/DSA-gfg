class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

// Worst Case TC = O(n)
// Best Case Tc = Theta(1)
// Worst Case SC = O(h), h--height
public class nodeatKdistance {

    static void nodeAtxDist(Node root, int x) {
        if (root == null) {
            return;
        }
        if (x == 0) {
            System.out.println(root.key + " ");
        } else {
            nodeAtxDist(root.left, x - 1);
            nodeAtxDist(root.right, x - 1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        heightofBT h = new heightofBT();
        nodeAtxDist(root, 2);

    }

}