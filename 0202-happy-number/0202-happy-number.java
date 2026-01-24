class Solution {
    public boolean isHappy(int n) {
/*
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);

      int count = 0 ;
      while(n!=1 )
      {
        int last_digit= n%10;

        count= count+(last_digit*last_digit);
        n/=10;

        if(n==0 )
        {   
              n = count;
              if(arr.contains(n))
              {
                return false;
              }
             
             arr.add(n);
              
             count=0;  
        }

      }
      


        if(n == 1)
        {
            return true;
        }
        
        return false;

        */
 
       if(n == 1 )
       {
        return true;
       }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);

        int count = 0;
        int fin = 0;
        while(fin!=1 )
        { 
            int last = n%10;
            int sq =  last*last;
            count = count+sq;
            n/=10;

            if(n == 0)
            {
                if(arr.contains(count))
                {
                    return false;
                }
                n = count ;
                fin = n;
                arr.add(n);
                count = 0;
            }
       

         } 
         return true;
}
}