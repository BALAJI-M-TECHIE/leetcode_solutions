class Solution {
    public int subarraySum(int[] nums, int k) {
       // ArrayList<Integer> al = new ArrayList<>();


/*
        if(nums.length==1)
        {
            if(nums[0]==k)
            {
                return 1;
            }
            return 0;
        }
        int left = 0;
        int right;
        int sum = 0;
        int count =0;

        for(right = 0;right<nums.length;right++)
        {
            sum+=nums[right];
            if(sum == k)
            {
                count++;
                sum-=nums[left];
                left++;
            }
            else if (sum>k)
            {
                sum-=nums[left];
                left++;
            }
            
        }


        if(sum == k)
        {
            count++;
        }
        return count;

 */

   int count = 0;

   for(int i =0;i<nums.length;i++)
   {
    int sum =0;
    for(int j =i;j<nums.length;j++)
    {       sum+=nums[j];
        if(sum==k)
        {
            count++;
        }
    }
   }  

   return count;     
    }
}