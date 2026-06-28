class Solution {
    public char findTheDifference(String s, String t) {

        if(s.length()==1 && t.length()==1)
        {
            return ' ';
        }
        if(s.length()==0 && t.length()==1)
        {
            return t.charAt(0);
        }

        int[] arr = new int[26];

        for(int i = 0;i<t.length();i++)
        {
            if(i<t.length()-1)
            {
                arr[s.charAt(i)-'a']++;
            }
            
            arr[t.charAt(i)-'a']--;
        }

        for(int i =0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                return (char)(i+'a');
            }
        }
        return ' ';
    }
}