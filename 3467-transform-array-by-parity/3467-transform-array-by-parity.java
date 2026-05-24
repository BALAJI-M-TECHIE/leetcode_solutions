class Solution {
    public int[] transformArray(int[] nums) {
        
        int even = 0;
        int odd =0;
        for(int x : nums)
        {
            if(x%2==0)
            even++;
            else
            odd++;
        }

        int[] narr= new int[nums.length];

        
        for(int i = 0 ;i<nums.length;i++)
        {
            if(even>0)
            {
                narr[i]=0;
                even--;
            }
            else
            {
                narr[i]=1;
            }
            
        }

        return narr;
    }
}