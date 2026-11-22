class Solution {
    public boolean checkString(String s) {

        int ind_b = -1;


        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) == 'b')
            {
                ind_b = i;
                break;
            }
        }

        if(ind_b == -1
        ) return true;

        for(int i = ind_b;i<s.length();i++)
        {
            if(s.charAt(i) == 'a')
            {
               return false;
            }
        }
return true;
        
    }
}