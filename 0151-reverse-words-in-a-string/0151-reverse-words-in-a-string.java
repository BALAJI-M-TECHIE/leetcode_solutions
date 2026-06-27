class Solution {
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        String a = s.trim();

        int end_ind = a.length()-1;
        int start_ind = 0;
        for(int i = a.length()-1;i>=0; i--)
        {
            if((a.charAt(i))==(' '))
            {
                start_ind = i+1;
                String b = a.substring(start_ind,end_ind+1);
                sb.append(b.trim());
                sb.append(" ");

                int j = i;
                while(a.charAt(j)==(' '))
                {
                    j--;
                }
                end_ind = j;
                i=j;
            }
        }

        sb.append(a.substring(0,end_ind+1));
        return new String(sb);
        
    }
}