class Solution {
    public int maxValidPairSum(int[] nums, int k) {

        int max = Integer.MIN_VALUE;

        // tc : o(n2) tle:
        /*

        for(int i =0;i<nums.length;i++)
            {
                // int sum = 0;
                for(int j = i+k;j<nums.length;j++)
                    {
                       
                            max = Math.max(nums[i]+nums[j],max);
                        
                    }
                
            }

        return max;

        */

        // ### contest : 

        int max_ele = Integer.MIN_VALUE;
        int sum_max = Integer.MIN_VALUE;

        for(int j = k;j<nums.length;j++)
            {

                if(nums[j-k]>max_ele)
                {
                    max_ele = nums[j-k];
                }
                if(max_ele + nums[j ]> sum_max)
                {
                sum_max = max_ele + nums[j];
                }
            }

        return sum_max;
        
        
    }
}