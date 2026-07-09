class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       

       // SIMULATION TRIED : BUT TLE : 
       /*  
        
        if((m*k)>bloomDay)
        {
            return -1;
        }

        

        int max_day = Integer.MIN_VALUE;

        for(int x : bloomDay)
        {
            max_day = Math.max(max_day,x);
        }


        int tot_flow = m*k;
        int days req = 0;

        int[] check = new int[bloomDay.length];

        for(int i = 1 ;i<=x;i++)  ->........ this is the place where we use Binary Search to optijmize //////

        
        {
            for(int j = 0;j<bloomDay.length;j++)
            {
                if(bloomDay[i]==i)
                {
                    check[j]=1;
                }

                
            }

            int bloose = 0;

            for(int l = 0;l<check.length-k;i+=k)
            {

            }

            if(bl)
        }

        */

        int max_day = 0;

        for(int x :bloomDay )
        {
            max_day = Math.max(x,max_day);
        }

        int left = 1;
        int right = max_day;
        int min_days = max_day;
        boolean flag = true;

        while(left<=right)
        {
            int mid = left+(int)((right - left)*0.5);
            int cnt = cal(bloomDay,mid,m,k);
           

            if(cnt>0)
            {
                 min_days = Math.min(cnt,min_days);
                 right = mid-1;
                 flag = false;
            }
            else
            {
                left = mid+1;
            }

        }

 if(!flag)
 {
    return min_days;
 }
 return -1;
    }

    int cal(int[] arr , int days , int bqts , int adj)
    {
        int makable = 0;
        int adj_count = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]<=days)
            {
                adj_count++;
                if(adj_count == adj)
                {
                    makable++;
                    adj_count = 0;
                }
              
            }
        else
            {
                adj_count = 0;
            }
        }

if(bqts <= makable)
{
     return days;
}

return -1;
       
    }
}