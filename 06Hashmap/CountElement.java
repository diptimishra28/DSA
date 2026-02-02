/*
        3005. Count Elements With Maximum Frequency

You are given an array nums consisting of positive integers.
Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
The frequency of an element is the number of occurrences of that element in the array.

Example 1:
Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.

Example 2:
Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.
 
Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100
 */

import java.util.*;

public class CountElement {

    public static int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Step 1: Count frequency
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        int maxFreq = 0;

        for (Integer key : hm.keySet()) {
            int value = hm.get(key);
            if(maxFreq <= value) {
                maxFreq = value;
            }
        }

        // Step 3: Sum frequencies equal to maxFreq
        int result = 0;
        for (Integer freq : hm.values()) {
            if (freq == maxFreq) {
                result += freq;
            }
        }

        return result;
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // input elements
        System.out.print("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = maxFrequencyElements(nums);
        System.out.println("Answer: " + ans);
    }
}
