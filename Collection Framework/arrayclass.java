import java.util.Arrays;

public class arrayclass {
    public static void main(String[] args) {
        // Binary Search
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(num, 7);

        System.out.println("Element is at index "+index);
        
        // Sorting
        int num2[] = {10,2,32,45,12,78,6,1,7};
        Arrays.sort(num2);

        // Arrays.fill(num2, 12);

        for(int i : num2){
            System.out.println(i);
        }


    
    }    
}
