import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class arrlist {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        // Same Operations for linked list also
        // List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println(list);
        // list.add(20);
        // System.out.println(list);
        // list.add(0, 25);
        // System.out.println(list);
        // System.out.println(list.get(2));

        // List<Integer> list2 = new ArrayList<>();
        // list2.add(11);
        // list2.add(111);

        // list.addAll(list2);
        // System.out.println(list);

        // System.out.println(list.get(1));

        // list.remove(1);
        // System.out.println(list);
        // list.remove(Integer.valueOf(20));
        // System.out.println(list);
        // list.clear();
        // System.out.println(list);

        // list.set(1, 5555);
        // System.out.println(list);
        // System.out.println(list.contains(20));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer ele : list) {
            System.out.println(ele);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next( ) );
        }



        

    }
}