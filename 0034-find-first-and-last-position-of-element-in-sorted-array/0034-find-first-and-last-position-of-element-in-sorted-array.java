class Solution {
    public int[] searchRange(int[] nums, int target) {

        // trying linear search : 

        int start = -1;
        int end = nums.length ;  // this is next element start so -1 for index for last occurence

        for(int i =0;i<nums.length;i++)
        {
            if((nums[i]==target) && start == -1)
            {

                start = i;
            }
            if(nums[i]>target)
            {
                end = i ;
                break;
            }
        }
        
        if(start == -1)
        {
            return new int[] {-1,-1};
        }
        return new int[] {start,end-1};
    }
}