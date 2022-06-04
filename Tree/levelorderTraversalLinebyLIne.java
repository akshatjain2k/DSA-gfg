import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class levelorderTraversalLinebyLIne {

    // TC = O(n+h) or O(n)
    // Aux Space = O(n) or Theta(w) -- where w is width of binary tree

    static void printlevelOrderbyLINE(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                    System.out.println();
                }
            } else {
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
                System.out.print(curr.key + " ");
            }
        }
    }

    // Method-2 using 2 loops

    // TC = O(n) or O(n)
    // Aux Space = O(n) or Theta(w) -- where w is width of binary tree

    static void printlevelLbLm2(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();

            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                System.out.print(curr.key + " ");
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            System.out.println();
        }
    }

    static void iterativeleftprint(Node root){
        if(root == null){
            return ;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false){
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if(i == 0)
                    System.out.println(curr.key + " ");
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
                }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        // printlevelOrderbyLINE(root);
        iterativeleftprint(root);

    }
}
