class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        if(s.length()<p.length())
        {
            return new ArrayList<>();
        }

        ArrayList<Integer> al = new ArrayList<>();

        // sliding window approach : 

        StringBuffer sb = new StringBuffer();
        int k = p.length();
        // initial window : 
        for(int i =0;i<k;i++)
        {
            sb.append(s.charAt(i));
           
        }

         if(isAnagrams(sb.toString(),p))
            {
                al.add(0);
            }
        // shrink and grow : 


        for(int i = k;i<s.length();i++)
        {
            sb.append(s.charAt(i));
            sb.deleteCharAt(0);
            if(isAnagrams(sb.toString(),p))
            {
                al.add(i-k+1);
            }
            
        }
        return al;


        
    }

    boolean isAnagrams(String a,String b)
    {
        int[] mark = new int[26];
        for(int i = 0;i<a.length();i++)
        {
            mark[a.charAt(i)-'a']++;
            mark[b.charAt(i)-'a']--;
        }

        for(int x : mark)
        {
            if(x!=0)
            {
                return false;
            }
        }
        return true;
    }
}