package CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListC {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        // ll.add(10);
        // ll.add(20);
        // ll.add(30);
        // ll.add(40);
        // ll.add(5);
        // ll.add(15);
        // System.out.println(ll);
        // ll.remove(2);
        // System.out.println(ll);
        ll.add("Delhi");
        ll.add("NewYork");
        ll.add("Moscow");
        ll.add("Dubai");
        ll.add(2, "element");
        // Collections.sort(ll);
        System.out.println(ll);


    }
}
