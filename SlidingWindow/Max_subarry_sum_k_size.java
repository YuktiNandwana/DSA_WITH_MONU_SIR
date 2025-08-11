import java.util.*;
public class Max_subarry_sum_k_size {
    public static void main(String[] args) {
        int arr[] = {2,3,6,4,3,9,10};
        int k = 3; // Define window size
        System.out.println(maxSubarraySum(arr, k));  // Fixed method name and parameters
    }
    
    public static int maxSubarraySum(int[] arr, int k) {  // Added k parameter and fixed method name
        if (arr.length < k) {  // Add input validation
            return -1;
        }
        
        int sum = 0;
        int ans = 0;
        
        // Calculate sum of first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        ans = sum;
        
        // Slide the window
        for (int i = k; i < arr.length; i++) {  // Changed <= to <
            //grow
            sum += arr[i];
            //shrink
            sum -= arr[i-k];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}