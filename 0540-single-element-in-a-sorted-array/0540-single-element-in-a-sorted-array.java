class Solution {
    public int singleNonDuplicate(int[] nums) {

        if(nums.length == 1)
        {
            return nums[0];
        }

        int i ;
        for( i =0;i<nums.length;i+=2)
        {
            if(((i+1)<nums.length) &&  nums[i]!=nums[i+1] )
            {
                return nums[i];
            }
        }
        
        return nums[i-2];
    }
}