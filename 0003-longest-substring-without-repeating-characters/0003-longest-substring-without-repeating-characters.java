class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==1)
    {
        return 1;
    }
        int len =0 ;
        int size = s.length();

        for(int i =0;i<size;i++)
        {
            StringBuffer sb = new StringBuffer();
            for(int j =i;j<size;j++)
            {
                if(!(sb.toString().contains(s.charAt(j) +"")))
                {
                    sb.append(s.charAt(j));
                }
                else
                {
                    
                    break;
                }
            }
            boolean result = len<sb.length();
                    if(result) {len=sb.length();} 
        }
        
        return len;
    }
}