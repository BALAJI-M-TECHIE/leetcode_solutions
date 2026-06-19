class Solution {
    public int largestAltitude(int[] gain) {

        int high = 0;

        for(int i =1 ; i<gain.length;i++)
        {
            gain[i]=gain[i-1]+gain[i];
        }

        for(int x : gain)
        {
            if(x>high)
            {
                high = x;
            }
        }

        return high;
        
    }
}