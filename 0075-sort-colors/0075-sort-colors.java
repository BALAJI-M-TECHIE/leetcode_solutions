class Solution {
    public void sortColors(int[] nums) {
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


        
    }
}