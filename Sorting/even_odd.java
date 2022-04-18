import java.util.Arrays;
import java.util.Comparator;

class MyCmp implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return a % 2 - b % 2;
        // if remainder is 0 then a element is prefered but if remainder is 1 then b
        // element is prefered
    }

    public class even_odd {

    }
 
    public static void main(String[] args) {
        Integer arr[] = { 5, 20, 10, 3, 12 };
        Arrays.sort(arr, new MyCmp());
        System.out.println(Arrays.toString(arr));
    }
}
