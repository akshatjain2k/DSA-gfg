import java.util.Map;
import java.util.TreeMap;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
    }
}

public class verticalSum {

    // Tc = O(nloghd + hd) = O(nloghd)
    // Aux Sp =
    // hd--Horizontal Distance
    static void vSumR(Node root, int hd, TreeMap<Integer, Integer> mp) {
        if (root == null) {
            return;
        }
        vSumR(root.left, hd - 1, mp);
        int pSum = (mp.get(hd) == null) ? 0 : mp.get(hd);
        mp.put(hd, pSum + root.data);
        vSumR(root.right, hd + 1, mp);
    }

    static void vSum(Node root) {
        TreeMap<Integer, Integer> mp = new TreeMap<Integer, Integer>();
        vSumR(root, 0, mp);
        for (Map.Entry sum : mp.entrySet()) {
            System.out.println(mp.values() + " ");
        }
    }
}
