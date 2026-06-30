class Solution {
    public void rotate(int[] nums, int k) {


/*
// BRUTE APPROACH TLE: 
        k = k%nums.length;

        for(int i =0;i<k;i++)
        {
            int temp = nums[nums.length-1];

            for(int j = nums.length-1;j>0;j--)
            {
                nums[j]=nums[j-1];
            }

            nums[0]=temp;
        }
*/

    k = k%nums.length;
        int len = nums.length;
        reverse(len-k,len-1,nums);
        reverse(0,len-k-1,nums);
        reverse(0,len-1,nums);

    
    

        
    }

    int[] reverse (int i ,int j,int[] nums)
    {
        while(i<j)
        {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }

        return nums;
    }
}