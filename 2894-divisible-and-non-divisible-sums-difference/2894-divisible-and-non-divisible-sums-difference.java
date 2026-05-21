class Solution {
    public int differenceOfSums(int n, int m) {
        int nonDiv =0;
        int totalSum = (n*(n+1))/2;

        int divcount = n/m;
        int divsum = 0;

        for(int i = 1; i<=divcount;i++)
        {
            divsum+=(i*m);
        }

        nonDiv = totalSum - divsum;

        return nonDiv - divsum;
    }
}