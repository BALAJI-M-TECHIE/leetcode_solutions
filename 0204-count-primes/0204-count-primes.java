class Solution 
{
    public int countPrimes(int n) 
    {

        // if(n<=1)
        // {
        //     return 0;
        // }
        // if(n==2)
        // {
        //     return 1;
        // }

        
      // ArrayList<Integer> al = new ArrayList<>();

        if(n<=2)
        {
            return 0;
        }

        if(n<=3)
        {
            return 1;
        }
        
        if(n<=4)
    {
        return 2;
    }

        int prime_count = 0;
        boolean[] arr = new boolean[n-1];
        arr[0] = true;
        
        for(int i =2;i*i<n;i++)
        {
             boolean result = true;
            for(int j =2;j<i;j++)
            {
                if(i%j == 0)
                {
                    result = false;
                    break;
                }
            
             }
          if(result)
        {
            // al.add(i);


            for(int k = i+i;k<=arr.length;k+=i)
            {
                arr[k-1] = true; // not a prime
            }
        }
        }

       for(boolean x : arr)
       {
        if(!x)
        {
            prime_count ++;
        }
       }

         return prime_count;
    }
}