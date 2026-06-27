class Solution {
    public boolean isAnagram(String s, String t) {

        int[] ss = new int[123];
        int[] tt = new int[123];

        if(s.length()!=t.length())return false;

        for(int i =0;i<s.length();i++)
        {
            ss[s.charAt(i)]++;
            tt[t.charAt(i)]++;
        }


        for(int i = 97 ; i<ss.length;i++)
        {
            if(ss[i]!=tt[i])
            {
                return false;
            }
        }
        
        return true;
        
    }
}