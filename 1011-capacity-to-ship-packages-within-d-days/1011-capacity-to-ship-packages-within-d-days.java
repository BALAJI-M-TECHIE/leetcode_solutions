class Solution 
{
    public int shipWithinDays(int[] weights, int days) 
    {
        
        int max_cap = 0;
        int max_ele = Integer.MIN_VALUE;
        for(int x : weights)
        {
            max_cap+=x;
            max_ele = Math.max(max_ele,x);
        }

        int left = max_ele;
        int right = max_cap;

        int min_days_req  = 0;

        while(left<=right)
        {
            int mid = left+(right-left)/2;

            if(isPos(weights,days,mid))
            {
               min_days_req = mid;
               right = mid-1; 
            }

            else
            {
                left = mid+1;
            }
        }

        return min_days_req;
    }

    boolean isPos(int[] arr, int days,int mid)
    {
        int cnt_weight = 0;
        int day_takes = 0;

        for(int x : arr)
        {
            if((cnt_weight+x)<=mid)
            {
                cnt_weight+=x;
            }
            else if(cnt_weight == 0 &&  (cnt_weight+x)>mid)
            {
                return false;
            }
            else
            {
                day_takes++;
                cnt_weight = 0;
                cnt_weight+=x;
            }
        }

        if(cnt_weight<=mid){day_takes++;}

        return day_takes<=days; 
    }
}