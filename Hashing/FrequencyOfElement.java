import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {

     // Tc = Theta(n)
    // Aux Space = O(n)
    static int countFreq(int a[]){
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int x : a){
            h.put(x, h.getOrDefault(x, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e : h.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        return 0;
    }
    public static void main(String[] args) {
        int a[] = { 50,50,10,40,40};
        System.out.println(countFreq(a));
    }
}
