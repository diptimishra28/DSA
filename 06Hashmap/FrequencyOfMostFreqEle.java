import java.util.*;

class Solution {

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);   // Step 1: sort the array

        long sum = 0;        // window sum
        int l = 0;           // left pointer
        int ans = 1;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            // cost = nums[r] * window_size - sum
            while ((long) nums[r] * (r - l + 1) - sum > k) {
                sum -= nums[l];
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}

public class FrequencyOfMostFreqEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.maxFrequency(nums, k);

        System.out.println("Maximum possible frequency: " + result);
    }
}
