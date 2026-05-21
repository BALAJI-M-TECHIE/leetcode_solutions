class Solution 
{
    public int majorityElement(int[] nums)
     {
        int candidate = nums[0];
        int count = 0;

        for(int x : nums)
        {
            if(candidate == x)
            {
                count++;
            }
            else if(count == 0)
            {
                candidate = x;
            }
            else
            {
                count--;
            }
        }

        int majCount = 0;

        for(int x : nums)
        {
            if(candidate == x)
            {
                majCount++;
            }
        }

        if(majCount >nums.length/2 )
        {
            return candidate;
        }
       
            return -1;
        
    }
}