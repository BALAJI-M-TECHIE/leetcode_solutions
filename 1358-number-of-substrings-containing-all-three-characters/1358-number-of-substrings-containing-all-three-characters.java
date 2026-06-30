class Solution {
    public int numberOfSubstrings(String s) {
      

      /* // BRUTE SOLUTION WITH O(N3)
        int count = 0;

        for(int i =0;i<s.length()-2;i++)
        {
            for(int j =i;j<s.length()-2;j++)
            {
                StringBuilder sb = new StringBuilder();
                sb = sb.append(s.substring(i,j+3));
                boolean a =sb.toString().contains("a");
                boolean b = sb.toString().contains("b") ;
                boolean c = sb.toString().contains("c");
                if(a && b && c)
                {
                    count++;
                }
            }
        }

        return count;

        */

/*
        if(s.length()<3)
        {
            return 0;
        }

        int[] freq_s = new int[3];
        int count =0;

    

        for(int i =0;i<s.length();i++)
        {
            for(int j =i;j<s.length();j++)
            {
                    if(s.charAt(j)-'a' <3)
                {
                    freq_s[s.charAt(j)-'a']++;
                }
                    if((j+1-i)>2 && (freq_s[0]>0 && freq_s[1]>0 && freq_s[2]>0))
                        {
                            count++;
                        }
            }
            freq_s[0]=0; freq_s[1]=0; freq_s[2]=0;


        } 


        for(int i = 0)
       
        return count;  */


        // OPTIMIZE IT : 

        int[] arr =new int[3];
        int left=0;
        int right = 0;
        int count =0;

        while(right<s.length())
        {
               
            arr[s.charAt(right)-'a']++; 
            
            
             while ( (arr[0]>0 && arr[1]>0 && arr[2]>0))
            {
                count+=(s.length()-right);
                arr[s.charAt(left++)-'a']--;
            
              
            }
          
           
              right++;
            


        }
        return count;
    }
}