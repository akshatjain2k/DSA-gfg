public class majority_element {

    static int majorElement(int[] arr) {

        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > arr.length / 2)
                return i;
        }

        return -1;
    }

    static int findMajority(int[] arr) {
        int res = 0, count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[res] == arr[i])
                count++;
            else
                count--;
            if (count == 0)
                res = i;
            count = 1;
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[res] == arr[i])
                count++;
        }
        if (count <= arr.length / 2)
            res = -1;
        return res;

    }

    public static void main(String[] args) {
        int[] arr = { 87, 8, 4, 9, 2 };
        System.out.println(majorElement(arr));
        System.out.println(findMajority(arr));
    }
}
