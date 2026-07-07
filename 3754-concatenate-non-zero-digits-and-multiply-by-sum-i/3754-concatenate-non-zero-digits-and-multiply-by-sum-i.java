class Solution {
    public long sumAndMultiply(int n) {

        if(n == 0)
        {
            return n;
        }
        if(n <10)
        {
            return n*n;
        }

       long x =  concate_nonZero(n);
       return x;
    
        
        
    }

 long concate_nonZero(int num)
    {

        long count = 1 ;
        long concat = 0;
        long sum = 0;

        while(num>0)
        {
        
            int last = num%10;
            sum+=last;
            if(last!=0)
            {
               
           
                 concat = (last*count)+concat;

            count*=10;
            }
             num=num/10;
            
        }

        return concat*sum;
    }
    
}