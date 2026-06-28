class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        // Brute method by 2 separate array ; 

        int[] pos = new int[nums.length/2]; 
        int[] neg = new int[nums.length/2]; 


        int i =0;
        int j =0;
        for(int x : nums)
        {
            if(x<0)
            {
                neg[j++]=x;
            }
            else
            {
                pos[i++]=x;
            }
        }

        for(int k =0;k<nums.length/2;k++)
        {
            nums[k*2]=pos[k];
            nums[k*2+1]=neg[k];

        }
        return nums;
    }
}