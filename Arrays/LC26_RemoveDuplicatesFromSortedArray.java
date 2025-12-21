class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int len = nums.length;
        for(int i = 0; i<len; i++)
        {
            if(nums[i]!=nums[k])
            {
                k++;
                nums[k] = nums[i];
            }
        }
        
        return k+1;
        
    }
}