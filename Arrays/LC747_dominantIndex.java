class Solution {
    public int dominantIndex(int[] nums) {

        int maxIndex = findMaxIndex(nums);
        int len = nums.length;
        for(int i = 0; i <len; i++)
        {
            if(i!=maxIndex){
                if(nums[i]*2 > nums[maxIndex])
                    return -1;
            }
        }
         return maxIndex;
        
    }

    public int findMaxIndex(int[] arr){
        int maxIndex = 0;

        int len = arr.length;
        for(int i = 1; i < len; i++){
            if(arr[i]>arr[maxIndex])
            maxIndex = i;
        }
        return maxIndex;

    }
}