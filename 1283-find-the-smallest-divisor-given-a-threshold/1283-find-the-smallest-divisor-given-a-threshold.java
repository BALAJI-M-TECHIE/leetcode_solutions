class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        if(nums.length>threshold)
        {
            return -1;
        }

        //int left = Integer.MAX_VALUE ; _> this lead to wrong becoz it find the smallest arr but not smallest divisor .
        int left =1;
        int right = Integer.MIN_VALUE ;

        for(int x : nums)
        {
            //left = Math.min(x,left);
            right = Math.max(x,right);
        }

        int result = right;

        while(left<=right)
        {
            int mid = left + (int)((right - left)* 0.5);

            if(ceil(nums,mid,threshold))
            {
                result = mid;
                right = mid-1;
                
            }
            else
            {
                left = mid+1;
            }
            


        }
        
        return result;
    }

    boolean ceil(int[] arr , int num , int limit)
    {
        int sum = 0;

        for(int x : arr)
        {
            //ceil val: 
            sum+=x/num;
            if(x%num!=0)
            {
                sum++;
            }
        }

        return sum<=limit;
    }

}