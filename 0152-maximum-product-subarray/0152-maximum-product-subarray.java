class Solution {
    public int maxProduct(int[] nums) {

        int max_product = Integer.MIN_VALUE;
        int len = nums.length-1;

        if(len == 0)
        {
            return nums[0];
        }

        for(int i =0;i<len;i++)
        {
            int prod = 1;
            for(int j =i;j<=len;j++)
            {
                prod *=nums[j];
                if(prod>max_product)
            {
                max_product = prod;
            }
            }
            
        }

        return Math.max(max_product,(nums[len]));
        
    }
}