

// Time complexity - O(nlog(n))

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int len = nums.length;

        for(int i = 0; i<len; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}




// OPTIMAL SOLUTION 
// time complexity- O(n)
// two pointer Solution

// class Solution {
//     public int[] sortedSquares(int[] nums) {
        
      
//         int len = nums.length;
//         int[] result = new int[len]; 
//         int left = 0;
//         int right = len - 1;
//         int leftSquare, rightSquare;
//         int pos = len - 1;

//         while(left<=right){
//             leftSquare = nums[left]*nums[left];
//             rightSquare = nums[right]*nums[right];

//             if(leftSquare > rightSquare){
//                 result[pos] = leftSquare;
//                 left++;
//             }
//             else{
//                 result[pos] = rightSquare;
//                 right--;
//             }
//             pos--;
//         }
//         return result;
//     }
// }