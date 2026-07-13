class Solution {
    public int findPeakElement(int[] nums) {

        // first and last element is peak if the element of next is small 
        //reason : (nums[-1] = nums[n] = -∞)

        // BRUTE APPROACH :
        
      /*  if(nums.length == 1)
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
        
        return -1;     */


        // TRYING BINARY SEARCH : 

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

        int left = 1 ;
        int right = nums.length-2;
       

        while(left<=right)
        {
            int mid = left+((right - left)/2);


            if(nums[mid]>nums[mid-1]  && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            // which side gonna move to find the peak ? 
            // move right : 

            else if(nums[mid]<nums[mid+1])
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }

        }

        return 0;
    }
}