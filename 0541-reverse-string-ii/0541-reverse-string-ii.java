class Solution {
   // StringBuffer sb ; 
    public String reverseStr(String s, int k)
 {

    /*    sb = new StringBuffer(s);

        if(k>=sb.length())
        {
          reverse(0,sb.length()-1);
          return sb.toString();
        }

        
        int start =0;
        int end = 0;
        while(start<=(sb.length()-(k)))
        {
            end=start+k;
            reverse(start,end-1);
            start=end+k;
        }
        
        return sb.toString();
    }

      void reverse(int i , int j)
      {
        while(i<j)
        {
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
      */

      char[] arr = s.toCharArray();

      int start = 0;
      int end = 0;

      while(start<arr.length)
      {
        if((start+k-1)<arr.length) // check of the end 
        {
            end = start+k-1;
        }
        else
        {
            end = arr.length-1;
        }
        int l = start ;
        int m = end;
         while(l<m)
         {
            char temp = arr[l];
            arr[l]= arr[m];
            arr[m]=temp;
            l++;m--;
         }
         start =start+(2*k);
      } 
     

return new String(arr);
    }
}