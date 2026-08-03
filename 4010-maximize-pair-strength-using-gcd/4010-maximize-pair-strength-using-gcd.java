class Solution {
    public long maxPairStrength(int[] nums) {
        long maxx  = -1;

        for(int i = 0;i<nums.length;i++)
            {
                for(int j = i+1 ;j<nums.length;j++)
                    {
                        long prod = (long)nums[i] * nums[j];

                        long gcd = gcdOf (nums[i],nums[j]);

                        maxx = Math.max(maxx,(prod/(gcd*gcd)));
                        
                    }
            }

return maxx;
        
    }

    long gcdOf(int a , int b)
    {
        while(b!=0)
            {
                int temp =b;
                b = a%b;
                a = temp;
               
            }
        return (long)a;
    }
}