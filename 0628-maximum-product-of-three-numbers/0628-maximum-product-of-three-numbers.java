class Solution {
    public int maximumProduct(int[] nums) {

        int first = Integer.MIN_VALUE; // highest
        int sec = Integer.MIN_VALUE; // sec least high 
        int third = Integer.MIN_VALUE;  // least high 
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int x : nums)
        {

            if(x<=min1)
            {
                min2 = min1;
                min1 = x;

            }
            else if(x<min2)
            {
                min2 = x;
            }
            if(x>=first)
            {
                third = sec;
                sec = first;
                first = x; 

            }
           else if(x<first && x>=sec)
            {
                third = sec;
                sec = x;
            }

            else if(x<first && x<sec && x>third)
            {
                third = x;
            }

        }

        int max1 = min1*min2*first;
        int maxx = first*sec*third;

        return Math.max(max1,maxx);

        
    }
}