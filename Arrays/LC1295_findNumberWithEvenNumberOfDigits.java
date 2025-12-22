class Solution {
    public int findNumbers(int[] nums) {

        int len = nums.length;
        int count = 0;
        int digits;
         for(int i = 0; i<len; i++)
         {
            digits = numberOfDigits(nums[i]);
            if(digits%2==0)
               count++;
         }
        return count;
    }

    public int numberOfDigits(int num){

        int digits = 0;
        while(num>0)
        {
            num /=10;
            digits++;
        }
        return digits;
    }
}