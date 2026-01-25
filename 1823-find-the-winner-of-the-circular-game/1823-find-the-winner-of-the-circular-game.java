class Solution {
    public int findTheWinner(int n, int k) {

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1 ; i<=n ;i++)
        {
            arr.add(i);
        }

/*
        int i = 0;

        while(arr.size()!=1)
        {
            i = i+k;
            if(i<arr.size())
            {
               arr.remove(i-1);
               
            }
            else
            {
                
                i = i-arr.size();
                if(i-1 <0)
                {
                    arr.remove(arr.size()-1-i);
                }
                else
                {
                    arr.remove(i-1);
                }
            }
            i--;
        }

 */


      
      int index =0;

      while(arr.size()!=1)
      {
        index = (index+k-1)%arr.size();
        arr.remove(index);
      }

 return arr.get(0);

    }
}