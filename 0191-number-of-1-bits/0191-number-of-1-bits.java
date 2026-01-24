class Solution {
    public int hammingWeight(int n) {

        int one_count = 1;

        while(n>1)
        {
            if(n%2 == 1)
            {
                one_count++;
            }
            n/=2;
            
        }

        return one_count;
        
    }
}