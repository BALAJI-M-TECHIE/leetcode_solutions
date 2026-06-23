class Solution {
    public int kthFactor(int n, int k) {

    

        if(k == 1 )
        {
            return 1;
        }

        if((n==k)&& n!=1 && n!=2 ||k<0)
        {
            return -1;
        }

           ArrayList<Integer> al = new ArrayList<>();
        for(int i =1;i<=n/i;i++)
        {
            if(n%i == 0)
            {
                al.add(i);
            if(i != n/i)
            {
                al.add(n/i);
            }
            }
            
        }
        Collections.sort(al);
        if(al.size()>=k)
        {
              return al.get(k-1);
        }
        return -1;
        
      
        
    }
}