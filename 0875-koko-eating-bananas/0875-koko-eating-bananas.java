class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int right = -1;

        for(int x : piles)
        {
            right = Math.max(right,x);
        }


        int left = 1;
        // right already got as the max of arryay 

        int k = 0;
        while(left<=right)
        {
            int mid = left+((int)((right-left)*0.5));
            long ceil_sum = cal(piles,mid); 
            if(ceil_sum<=(long)h)
            {
                k = mid;
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        
        return k;
        
    }

    long cal(int[] arr,int cabable)
    {
        // finding the ceil value  -  If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

        long tot_hr = 0;

        for(int x : arr)
        {
           tot_hr+=( x/cabable);
          
            if( x%cabable !=0)
            {
                tot_hr++;
            }
        }

        return tot_hr;
    }
}