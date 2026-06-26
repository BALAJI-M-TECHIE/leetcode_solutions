class Solution {
    public int maximumPrimeDifference(int[] nums) {

        int i =0;
        int j = nums.length-1;
        int ii =0;
        int jj = 0;
        while(ii==0|| jj ==0 && i<=j)
        {
            if(!isPrime(nums[i]))
            {
                i++;
            }
            else
            {
                ii =1;
            }
             if(!isPrime(nums[j]))
            {
                j--;
            }
            else
            {
                jj =1;
            }
            
        }

        return j-i;
        
    }

    public boolean isPrime(int a)
{


    boolean val = true;

    if(a == 1)
        {
            val = false;
          
        }

        else
        {
             for(int i = 2;i<=a/i;i++)
            {
                if(a%i == 0)
                {
                    val = false;
                    break;
                }
             }
        }
   

    return val;
}
}