class Solution {
    public void sortColors(int[] nums) {

         int low =0;
         int mid = 0; // used of tracking 
         int high = nums.length -1;

         while(mid<=high)
         {
            if(nums[mid] == 0)
            {
                // swap 
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                mid++;
                low++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                 // swap 
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
         }


        /*
        BETTER APPROACH USING COUNTING OF 0,1,2
        int zeroCount = 0;
        int oneCount = 0;
       
        for(int x : nums)
        {
            if(x == 0)
             zeroCount++;
            else if(x == 1)
             oneCount++;  
        }
         int twoCount = nums.length - (zeroCount + oneCount);

         for(int i = 0;i<nums.length;i++)
         {
            if(zeroCount>0)
            {
                nums[i] = 0;
                zeroCount--;
            }
            else if(oneCount > 0)
            {
                nums[i] = 1;
                oneCount--;
            }
            else
            {
                nums[i] = 2;
                twoCount--;
            }

         }
*/


        
    }
}
