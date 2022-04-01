package Recursion;

public class SubsetSumProblem {
    
    static int CountSubset(int arr[], int n, int sum){
        if(n==0)
            return (sum==0) ? 1 : 0;
        return CountSubset(arr, n-1, sum) + CountSubset(arr, n-1, sum-arr[n-1]);
    }

    public static void main(String[] args) {
        // System.out.println(CountSubset(10,15,25, 3, 25));
    }
}
