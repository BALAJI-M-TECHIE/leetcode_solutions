class Solution {
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer(s);
        
        int last_index = 0;
        int i =0;

        while(i<sb.length())
        {
            if(sb.charAt(i)==' ')
            {
                int z_start = last_index;
                int z_last = i-1;
                while(z_start<z_last)
                {
                  char temp = sb.charAt(z_start);
                  sb.setCharAt(z_start,sb.charAt(z_last));
                  sb.setCharAt(z_last,temp);

                  z_start++;
                  z_last--;

                }
                last_index = i+1;
            }

            if(i==sb.length()-1)
            {
                 
                int z_start = last_index;
                int z_last =i;
                while(z_start<z_last)
                {
                  char temp = sb.charAt(z_start);
                  sb.setCharAt(z_start,sb.charAt(z_last));
                  sb.setCharAt(z_last,temp);

                  z_start++;
                  z_last--;

                }
            
            }
            i++;
            

        }
 
 return sb.toString();
        
    }
}