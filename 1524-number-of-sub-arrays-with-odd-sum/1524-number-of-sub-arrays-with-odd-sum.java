class Solution {
    public int numOfSubarrays(int[] arr) {
/*
      int[] prefix_sum = new int[arr.length+1];
        prefix_sum[0]=0;
        
        for(int i = 0 ;i<arr.length;i++)
        {
            int num = prefix_sum[i]+arr[i];
            prefix_sum[i+1]=num;
            
            
        }

            long odd_sum = 0;
        for(int i = 0 ; i<prefix_sum.length;i++)
        {
            for(int j = 1;j<=arr.length;j++)
            {
                int range = j+i;

                if(range>arr.length)
                {
                    break;
                }

                if((prefix_sum[range]-prefix_sum[i] )%2==1)
                {
                    odd_sum++;
                }

            }
        }



        return (int)((odd_sum)%(1000000007)) ; */

        
        int even = 1;
        int odd = 0;
        int sum = 0;
        long odd_count =0;

        for(int x : arr)
        {
            sum+=x;
            if(sum%2==1)
            {
                odd++;
                odd_count+=even;
            }
            else
            {
                even++;
                odd_count+=odd;
            }
        }

  return (int)(odd_count%(1000000007)); 
    }
}