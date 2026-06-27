class Solution {
    public int findMin(int[] nums) {

        if(nums.length == 1)
        {
            return nums[0];
        }

        if(nums.length == 2)
        {
            return Math.min(nums[0],nums[1]);
        }

        int low = 0;
        int high = nums.length - 1;
        while(low<=high)
        {
            int mid = low + (int)((high - low)*0.5);
            if(nums[mid]>nums[mid-1] && nums[mid]<nums[mid+1])
            {
                if(nums[mid]<nums[low])
                {
                    high = mid;
                }
                else if(nums[mid]>nums[high])
                {
                    low = mid+1;
                }
                else
                {
                    return nums[0];
                }
            }

            else
            {
                return Math.min(nums[mid-1],(Math.min(nums[mid],nums[mid+1])));
            }
        }
        return nums[0];
        
    }
}