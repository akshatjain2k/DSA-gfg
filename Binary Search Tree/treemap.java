import java.util.*;

public class treemap {
    public static void main(String[] args) {
    TreeMap<Integer, String> t = new TreeMap<Integer, String>();
    t.put(10, "geeks");
    t.put(15, "ide");
    t.put(5, "courses");
    
    System.out.println(t);
    System.out.println(t.containsKey(10));
    for(Map.Entry<Integer,String>e : t.entrySet()){
        System.out.println(e.getKey() + " " + e.getValue());
    }

    System.out.println("Size: "+t.size());
    t.remove(10);
    System.out.println("Size after removing: "+t.size());
    t.put(10, "geeks");
    System.out.println("key operations: ");
    System.out.println(t.higherKey(10));
    System.out.println(t.lowerKey(10));
    System.out.println(t.floorKey(10));
    System.out.println(t.ceilingKey(10));
    }
}
