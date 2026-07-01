class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> al = new ArrayList<>();

        for(int i =1;i<=numRows;i++)
        {
            ArrayList<Integer> aa = new ArrayList<>();

            for(int j =1;j<=i;j++)
            {
                aa.add(ncr(i-1,j-1));
            }
            al.add(aa);
        }

       return al;
         
    }

    public int ncr(int n, int r)
    {
        if(n == r || r == 0)
        {
            return 1;
        }

        int sum = 1;

        for(int i =0;i<r;i++)
        {
            sum = (sum*(n-i))/(1+i);
        }

        return sum;



    }

}