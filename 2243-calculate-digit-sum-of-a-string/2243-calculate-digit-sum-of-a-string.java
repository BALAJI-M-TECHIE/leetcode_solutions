class Solution {
    public String digitSum(String s, int k) {
        
        
        while(s.length()>k)
        {
            ArrayList<Integer> al = new ArrayList<>();
            int sum = 0;
            for(int i=0;i<s.length();i++)
            {
               
                if(i!=0 && i%k==0)
                {
                    al.add(sum);
                    sum=0;
                    
                } 
               
                sum+=Integer.valueOf(s.charAt(i)+"");
            }
            al.add(sum);
            s="";
            for(int x : al)
            {
                s=s+x+"";
            }

        
        }

        return s;
    }
}