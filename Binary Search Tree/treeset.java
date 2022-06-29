import java.util.*;
public class treeset {
    public static void main(String[] args) {
        System.out.println("Output 1");
        TreeSet<String> s = new TreeSet<String>();
        s.add("gfg");
        s.add("course");
        s.add("ide");
        System.out.println(s);
        System.out.println(s.contains("ide"));
        Iterator<String> i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Output 2");
        TreeSet<Integer> b = new TreeSet<Integer>();
        b.add(10);
        b.add(5);
        b.add(2);
        b.add(15);
        System.out.println(b.lower(5));
        System.out.println(b.higher(5));
        System.out.println(b.floor(5));
        System.out.println(b.ceiling(5));
            
        System.out.println("Output 3");
        TreeSet<Integer> a = new TreeSet<Integer>();
        a.add(10);
        a.add(5);
        a.add(2);
        a.add(15);
        a.remove(5);

        for(Integer x :a){
            System.out.println(x + "");
        }
    }
}
