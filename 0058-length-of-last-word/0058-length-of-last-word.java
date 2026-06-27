class Solution {
    public int lengthOfLastWord(String s) {
    /*    String z=s.trim();

        int a=0;
        int count =0;
        int i =z.length()-1;
       while(a==0)
       {
        char aa = z.charAt(i);
         if(aa == ' ')
         {
            a=1;
         }
         else
         {
            count++;
         }
       }

       return count;

       */

        
       //int count = 0;
       String z=s.trim();
        int i = z.length()-1;
        
        int end = z.length()-1;

        while(true)
        {
            if(z.charAt(end)==' ')
            {
                end --;
            }
            else
            {
                break;
            }
        }

        int k ;
        for( k = end ; k>=0;k--)
        {
            if(z.charAt(k)==' ')
            {
                break;
            }
        }

        return end - k
        ;
        
    }
}