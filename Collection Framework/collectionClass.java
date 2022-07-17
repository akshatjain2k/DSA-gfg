import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionClass {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("Min Element: "+ Collections.min(list));
        System.out.println("Max Element: "+ Collections.max(list));
        System.out.println(Collections.frequency(list, 12));
    
        Collections.sort(list);

        //reverse sort
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
