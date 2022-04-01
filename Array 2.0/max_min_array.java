public class max_min_array {

    static int findmax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int findmin(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 1};
        System.out.println(findmax(arr));
        System.out.println(findmin(arr));
    }
}
