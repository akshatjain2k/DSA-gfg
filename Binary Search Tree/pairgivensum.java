import java.util.HashSet;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
    }
}

public class pairgivensum {

    // O(n)
    // O(h)
    static boolean isPairSum(Node root, int sum, HashSet<Integer> s) {
        if (root == null) {
            return false;
        }
        if (isPairSum(root.left, sum, s) == true) {
            return true;
        }
        if (s.contains(sum - root.data)) {
            return true;
        } else {
            s.add(root.data);
        }
        return isPairSum(root.right, sum, s);
    }
}
