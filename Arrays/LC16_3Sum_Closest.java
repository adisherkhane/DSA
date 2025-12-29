import java.util.Arrays;
/**
 * LeetCode 16 - 3Sum Closest
 *
 * Problem:
 * Given an integer array nums and an integer target,
 * return the sum of three integers in nums such that the sum is closest to target.
 *
 * Approach:
 * - Sort the array
 * - Fix one element and use two pointers for the remaining two
 * - Track the closest sum using absolute difference
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1) (ignoring sorting space)
 */


class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int right, left;
        int len = nums.length;
        
         // Sort the array to apply two-pointer technique
        Arrays.sort(nums);

        // Initialize closest sum using the first valid triplet
        int closest = nums[0] + nums[1] + nums[len-1];


        // Fix the first element one by one
        for(int i = 0; i<len-2;i++)
        {
            left = i+1;
            right = len-1;

            // Two-pointer approach
            while(left<right){

                int sum = nums[i] + nums[left] + nums[right];

                // If exact match is found, this is the closest possible sum
                if(sum == target)   return sum;
                

                // Update closest sum if current sum is closer to target
                if(Math.abs(sum - target) < Math.abs(closest - target) )
                    closest = sum;
                
                // Move pointers based on comparison with target
                if(sum<target)  left++;
                else  right--;
            }

        }      
        return closest;
    }
}