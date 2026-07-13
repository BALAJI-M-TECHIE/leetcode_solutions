class Solution {
    public int findPeakElement(int[] nums) {

        // first and last element is peak if the element of next is small 
        //reason : (nums[-1] = nums[n] = -∞)

        // BRUTE APPROACH :
        
        if(nums.length == 1)
        {
            return 0;
        }
        if(nums[0]>nums[1])
        {
            return 0;
        }
        else if(nums[nums.length-1]>nums[nums.length-2])
        {
            return nums.length-1;
        }

// checking neighbours
        for(int i = 1;i<nums.length-1;i++)
        {

            if((nums[i] > nums[i+1]) && (nums[i-1]<nums[i]))
            {
                return i;
            }
           
        }
        
        return -1;
    }
}