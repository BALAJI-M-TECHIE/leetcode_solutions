class Solution {
    public int reverse(int x) {

        StringBuffer sb = new StringBuffer();
        String num = String.valueOf(x);

        int length = num.length();
        for(int i = length-1 ; i>=1;i-- )
        {
          sb.append(num.charAt(i));
        }

        if(num.charAt(0)=='-')
        {
            String n = "-"+sb.toString();
             if(Long.valueOf(n)<=Integer.MAX_VALUE && Integer.MIN_VALUE <=Long.valueOf(n) )
            {
                return Integer.valueOf(n) ;
            }
            return 0;
        }
        else
        {
            sb.append(num.charAt(0));
            String n = sb.toString();
            if(Long.valueOf(n)<=Integer.MAX_VALUE && Integer.MIN_VALUE <=Long.valueOf(n) )
            {
                return Integer.valueOf(n) ;
            }
         
            return 0;
        }
        
      
    }
} 