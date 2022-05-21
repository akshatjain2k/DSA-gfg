import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class dequeinjava {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<Integer>();
        /*
         * offerFirst = addFirst
         * offerLastt = addLast
         * pollFirst = removeFirst
         * pollLast = removeLast
         * peekFirst = getFirst
         * peekLast = getLast
         */
        d.offerFirst(10);
        d.offerLast(50);
        d.offerFirst(9);
        d.offerLast(51);
        d.addFirst(5);

        // Iterator it = d.iterator();
        // while (it.hasNext())
        // System.out.print(it.next() + ", ");
        // System.out.println();

        for (int x : d)
            System.out.print(x + ", ");
        System.out.println();

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        d.removeFirst();
        System.out.println(d.peekFirst());
        d.pollLast();
        System.out.println(d.peekLast());

    }
}
