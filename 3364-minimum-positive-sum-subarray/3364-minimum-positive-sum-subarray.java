class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int min_e = Integer.MAX_VALUE;

        int range = l;
        while(!(range==r+1))
        {
            int size = 0;
            int sum = 0;

            //sliding window : 

            for(int i = 0;i<nums.size();i++)
            {

                
                size++; sum+=nums.get(i);
                if(size==range)
                {
                   
                   min_e = sum>0?Math.min(sum,min_e):min_e;

                }
                else if(size>range)
                {
                     size --;
                     sum-=nums.get(i-range);
                    min_e = sum>0?Math.min(sum,min_e):min_e;
                }

                
            }
            range++;
        }

        if(min_e == Integer.MAX_VALUE)
        {
            return-1;

        }
        return min_e;

        
    }
}