class Solution {
    public List<Integer> getRow(int rowIndex) {

        if(rowIndex == 0)
        {
            return new ArrayList<>(List.of(1));
        }
        if(rowIndex == 1)
        {
            return new ArrayList<>(List.of(1,1));
        }

        List<Integer> al = new ArrayList<>();

        for(int i = 0 ; i<=rowIndex;i++)
        {
            al.add(ncr(rowIndex,i));
        }

    return al;

     
    }

    public int ncr(int n , int r)
    {
     if(r == 0)
     {
        return 1;
     }   

     long num = 1;

     for(int i =0;i<r;i++)
     {
       num=num*(n-i)/(i+1);
     }

     return (int)num;
    }
}