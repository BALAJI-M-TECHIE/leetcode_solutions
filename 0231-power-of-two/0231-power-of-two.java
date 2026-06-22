class Solution {
    public boolean isPowerOfTwo(int n) {

   /*     if(n==0|| n!=1 && n%2==1)
        {
           return false;
        }

        if(n==1)
        {
            return true;
        }

        int sqrt = (int)Math.sqrt(n)+1;
        int power_count = 1;
        
        for(int i = sqrt ;i>=1 ;i--)
    {
          power_count= power_count*2;

          if(n == power_count)
          {
            return true;
          }

        
    }
        return false;  */

        if(n==1 || n ==2 ||n ==4||n ==8  )
        {
            return true;
        }
        if(n ==0)
        {
            return false;
        }

int num = n;
        while(!(num==1) && (num%2 == 0))
        {
            
            num/=2;
        }

        if(num==1)
        {
            return true;
        }
return false;    }
}