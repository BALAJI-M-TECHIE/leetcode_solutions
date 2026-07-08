class Solution {
    public int search(int[] nums, int target) {
        
        // BINARY SEARCH : 

        int len = nums.length-1;
       

        int left = 0;
        int right = len ; 
        while(left<=right)
        {
            int mid = left+((right - left)/2);

            if(nums[mid] == target)
            {
                return mid;
            }
            // right sort check
            else if(nums[mid]<nums[right] )
            {
                if(target>nums[mid] && target<=nums[right])
                {
                    left = mid+1;
                }
                else
                {
                    right = mid-1;
                }
                
            }
            // left sort check 
            else
            {
                if(target<nums[mid] && target>=nums[left])
                {
                    right = mid-1;
                }
                else
                {
                    left = mid+1;
                }
            }
        }

 return -1;
    }
}