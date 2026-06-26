class Solution {
    public int sumOfPrimesInRange(int n) {

        // single digits: 
        if(n<10)
        {
            if(isPrime(n) && n!=1
            )
            {
                return n;
            }
            else
            {
                return 0;
            }
        }

        

        int left = n;
        
        // reverse int ; 

        int temp = n;
        int right = 0;

        while(temp>0)
        {
            int digit = temp%10;
            right = right*10+digit;
            temp/=10;

        }

        // same when reverse:

        if(left == right)
        {
            if(isPrime(left) && left!=1)
            {
                return left;
            }
            else
            {
                return 0;
            }
        }

         if(left>right)
          {
              int tempz = left;
              left = right;
              right = tempz;
          }

        // create array 
        boolean[] arr = new boolean[Math.abs(right-left)+1];
        // all are false now : 

        for(int i = left ; i<=right;i++)
        {
            if(isPrime(i) && i!=1)
            {
                
                for(int j = i*2;j<=right;j+=i)
                {
                    arr[j-left] = true;
                }   
            }
            else
            {
                arr[i-left] = true;
            }
        }

        int sum = 0;

        for(int i =0;i<arr.length;i++)
        {
            if(!arr[i])
            {
                sum+=i+left;
            }
        }

        return sum;
    }

    public boolean isPrime(int num )
    {
        boolean val = true;
        for(int i = 2 ; i<=num/i;i++)
        {
            if(num%i == 0)
            {
                val = false;
            }
        }

        return val;
    }
}