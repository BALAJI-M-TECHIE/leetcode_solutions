class Solution {
    public int minChanges(String s) {
        
       /* int a = 0;  // 0 count
        int b = 0;  // 1 count 
        int c = 0;
        int d = 0;

        if((s.length()/2)%2==0)
        {

        
        for(int i =0;i<s.length();i++)
        {
            if(i<s.length()/2)
            {
                if(s.charAt(i) == '0') a++;
                else b++;
            }
            else
            {
                if(s.charAt(i) == '0') c++;
                else d++;
            }
        }

        int left = (a<=b)?a:b;
        int right = (c<=d)?c:d;

        return left+right;
        }

       
            int aa = 0;  // 0 count
            int bb = 0; 

               for(int i =0;i<s.length();i++)
        {
            
                if(s.charAt(i) == '0') aa++;
                else bb++;
            
        }


        return Math.min(aa,bb);
        
   */


   int count = 0;

   for(int i = 1;i<s.length();i+=2)
   {
    if(s.charAt(i-1)!=s.charAt(i))
    {
        count++;
    }
   }

   return count;
      
    }
}