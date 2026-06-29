class Solution {
    public int maxSubArray(int[] nums) {

    
    /*  BRUTE APPROACH 
    
        if(nums.length ==1)
        {
            return nums[0];
        }

        int n =nums.length;
        int max = Integer.MIN_VALUE; 

        for(int i =0;i<n;i++)
        {
            int sum =0;
            for(int j =i;j<n;j++)
            {
                sum+=nums[j];
                if(sum>max)
                {
                    max =sum;
                }
            }
        }


        return max; */
        
        int max = Integer.MIN_VALUE;
        int sum =0;

        int i =0;
        while(i < nums.length)
        {
            sum+=nums[i];
            if(max <sum)
            {
                max = sum;
            }
            if(sum<0)
            {
                sum=0;

            }

            i++;
        }
        
        return max;
        
    }
}