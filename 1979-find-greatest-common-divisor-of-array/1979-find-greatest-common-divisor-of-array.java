class Solution {
    public int findGCD(int[] nums) {

        int larg = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int x : nums)
        {
            larg = Math.max(larg,x);
            small = Math.min(small,x);
        }

       return findGcd(small,larg);
    }

    int findGcd(int a , int b)
    {
        while(b!=0)
        {
            int rem = a%b;
            a = b;
            b = rem;
        }

        return a;
    }
}