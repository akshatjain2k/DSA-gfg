package CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListC {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
        ll.add(2, 17);
        System.out.println(ll);
        // ll.clear();
        // ll.clone();
        ll.addFirst(12);
        ll.addLast(78);
        System.out.println(ll.contains(40));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll);
        // Collections.sort(ll);
        System.out.println(ll);

    }
}
