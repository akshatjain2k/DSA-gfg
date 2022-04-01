package Array;

public class allZeroatend {

    // public static void swap(){
    //     int arr[] = { 5, 0, 20, 0, 25, 30 };
    //     int n = arr.length;   

    //     int temp = 0;
    //     for(int i=0; i<n; i++){
    //         temp = arr[i];
    //         arr[i] = arr[i+1];
    //         arr[i+1] = temp;
    //     }
    // }

    public static void moveZeros() {

        int arr[] = { 5, 0, 20, 0, 25, 30 };
        int n = arr.length;

        int count = 0;
        int temp;
        for(int i =0; i<n; i++){
            if(arr[i] != 0){
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
          for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
         }

        // int temp;
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] == 0) {
        //         for (int j = i + 1; j < n; j++) {
        //             if (arr[j] != 0) {
        //                 temp = arr[i];
        //                 arr[i] = arr[j];
        //                 arr[j] = temp;
        //             }
        //         }
        //         // add fumction
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.println(arr[i] + " ");
        // }
    }

    public static void main(String[] args) {
        moveZeros();
    }
}
