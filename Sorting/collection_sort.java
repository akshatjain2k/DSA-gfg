import java.util.*;

class Point implements Comparable<Point> {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p) {
        return this.x = p.x;
    }
}

public class collection_sort {
    public static void main(String[] args) {

        // List<Integer> list = new ArrayList<Integer>();
        // list.add(10);
        // list.add(5);
        // list.add(50);
        // Collections.sort(list);
        // System.out.println(list);
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);

        List<Integer> list = new ArrayList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        Collections.sort(list);
        for (Point p : li1st) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
