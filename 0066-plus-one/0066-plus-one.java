class Solution 
{
    public int[] plusOne(int[] digits) 
    {
    
    int last = digits.length-1;
    int carry = 1;

    while(carry == 1 && last>=0)
    {
         

              if(last == 0 && carry == 1 && digits[last]==9 )
        {
            int[] arr = new int[digits.length+1];
            arr[0]=1;
            for(int i =1;i<arr.length;i++)
            {
                arr[i]=0;
            }
            return arr;

        }

 digits[last] += 1;
          if(digits[last] == 10)
          {
            digits[last]=0;
            carry = 1;
            last--;
          }
          else
          {
            carry=0;
          }
    
    }
 return digits; 
    }
}