class Solution {
    public int arrangeCoins(int n) {
         
         if(n==1)
         {
            return n;
         }
        int rows = 0 ; 
        while(n>0)
        { rows++;
            n = n - rows;
           
        }
         if(n<0)
         {
            return rows -1;
         }
        return rows;
        
    }
}