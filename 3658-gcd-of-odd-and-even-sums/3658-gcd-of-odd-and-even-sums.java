class Solution {
    public int gcdOfOddEvenSums(int n) {

        int sum_odd = 0;
        int sum_even = 0;

        for(int i =1;i<=n*2;i++)
        {
           if(i%2==1) sum_odd+=i;
           else sum_even+=i;

        }

        for(int i =(int)Math.sqrt(sum_odd);i>=1;i--)
        {
            if(sum_odd %i==0 && sum_even %i==0)
            {
                return i;
            }
        }
        
        return -1;
    }
}