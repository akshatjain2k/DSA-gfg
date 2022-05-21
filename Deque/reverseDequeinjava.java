import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

public class reverseDequeinjava {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<Integer>();

        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);

        Iterator it = d.iterator();
        while (it.hasNext())
            System.out.print(it.next() + ", ");
        System.out.println();

        System.out.println("Now in Reverse: ");

        Iterator rit = d.descendingIterator();
        while (rit.hasNext())
            System.out.print(rit.next() + ", ");
        System.out.println();

    }
}
