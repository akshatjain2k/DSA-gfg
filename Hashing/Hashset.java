import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("gfg");
        h.add("Courses");
        h.add("ide");
        System.out.println(h);
        System.out.println(h.contains("ide"));

        // Iterator<String> i = h.iterator();
        // while (i.hasNext()) {
        //     System.out.println(i.next() + " ");
        // }
        System.out.println(h.size());
        // h.clear(); // To clear the list
        System.out.println(h.size());
        
        h.remove("ide");
        System.out.println(h.size());
        
        for (String s : h){
            System.out.println(s+ ", ");
        }
        System.out.println(h.isEmpty());
    }
}
