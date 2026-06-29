class Solution {
    public boolean isPalindrome(String s) {
     
       // two pointer for char only : -> this fails becoz not read the numberic
/*
       if(s.length()==1)
       {
        return true;
       }

       int i = 0;
       int j = z.length()-1;

       while(i<j)
       {
        
        if(((z.charAt(i)>='0' && z.charAt(i)<='9')||(z.charAt(j)>='0' && z.charAt(j)<='9'))||(z.charAt(i)>='a') && z.charAt(j)>='a'))
        {
            if(z.charAt(i)!=z.charAt(j))
                {
                    return false;
                }
            x i++;
            j--;
        

        }
        else if(z.charAt(i)<'a')
        {
            i++;
        }
        else if(z.charAt(j)<'a')
        {
            j--;
        }
      
    
           
        
       }

       return true;

       */


// note it is better to check the current is number or char rather than checking the condition for the where is non alphanumeric : check is it alphanumeric, thats easy : 
        String z =  s.toLowerCase();

        int i =0;
        int j= z.length()-1;

        while(i<j)
        {
            // int cur ;
            // int r_cur ;
           
           

                // if(((z.charAt(i)-'0'>=0) && (z.charAt(i)-'0'<=9) ||( z.charAt(i)-'a'>=0) && (z.charAt(i)-'a'<26)) && ((z.charAt(j)-'0'>=0) && (z.charAt(j)-'0'<=9) ||( z.charAt(j)-'a'>=0) && (z.charAt(j)-'a'<26)))
                // {
                //     if(z.charAt(i)==z.charAt(j))
                //     {
                //         i++;
                //         j--;
                //     }
                //     else
                //     {
                //         return false;
                //     }
                // }
                if (!((z.charAt(i)-'0'>=0) && (z.charAt(i)-'0'<=9)) && !(( z.charAt(i)-'a'>=0) && (z.charAt(i)-'a'<26)))
                 {
                    i++;
                 }
                 else if(!((z.charAt(j)-'0'>=0) && (z.charAt(j)-'0'<=9))  && !(( z.charAt(j)-'a'>=0) && (z.charAt(j)-'a'<26)))
                 {
                    j--;
                 }
                 else
                    {
                         if(z.charAt(i)==z.charAt(j))
                    {
                        i++;
                        j--;
                    }
                    else
                    {
                        return false;
                    }

                 }

            
            

        }

        return true;
        
    }
}