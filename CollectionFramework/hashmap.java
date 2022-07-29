import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashmap {
    public static void main(String[] args) {
        
        // Operation done in O(1)
        // Map<String, Integer> number = new HashMap<>();

        // In sorted order of keys
        // Operation done in O(logn)
        Map<String, Integer> number = new TreeMap<>();

        number.put("One", 1);
        number.put("Two", 2);
        number.put("Three", 3);
        number.put("Four", 4);
        number.put("Five", 5);

        // Override
        // number.put("Two", 24);
        // to not get override
        // if(!number.containsKey("Two")){
        //     number.put("Two", 24);
        // }

        // number.putIfAbsent("Two", 24); 

        // number.remove("Five");

        System.out.println(number.containsValue(5));
    
        System.out.println(number.isEmpty());

        // number.clear();
        System.out.println(number);

        for(Map.Entry<String, Integer> e : number.entrySet()){
            System.out.println(e);

            // System.out.println(e.getKey());
            // System.out.println(e.getValue());
        }
        // Return keys
        for(String key : number.keySet()){
            System.out.println(key);
        }
        
        // Return Values
        for(Integer value : number.values()){
            System.out.println(value);
        }

        // System.out.println(number);
    }
}
  