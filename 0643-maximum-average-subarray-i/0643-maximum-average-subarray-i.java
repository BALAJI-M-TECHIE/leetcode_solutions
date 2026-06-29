class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        

        if(nums.length==1)
        {
            return (double)nums[0];
        }

        int sum =0;
        for(int i =0;i<k;i++)
        {
            sum+=nums[i];
        }

        int max =sum;
        for(int i =k;i<nums.length;i++)
        {
            sum+= nums[i]-nums[i-k];
            if(sum>max)
            {
                max = sum;
            }
        }


        //return double((double)max/(double)k);

        return (double)((double)max/(double)k);
    }
}