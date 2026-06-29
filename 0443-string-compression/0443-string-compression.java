class Solution {
    public int compress(char[] chars) {

        /*

        int[] arr = new int[123];

        for(char i : chars)
        {
            arr[i]++;
        }        

        int count=0;
        int ind = 0;

        StringBuffer sb = new StringBuffer();
        for(int i =0;i<123;i++)
        {
            boolean result = arr[i]>1;
            boolean result_2 = arr[i]==1;

            if(result)
            {
                sb.append((char)i);
                sb.append(arr[i]);
                if(arr[i]>9)
                {
                    count++;
                }
                count+=2;
            }
            else
            {
                if(result_2)
                {
                    sb.append((char)i);
                    count++;
                }
            }
        }

        // modifying the chars 

        for(int i =0;i<sb.length();i++)
        {
            chars[i]=sb.charAt(i);
        }

        return count;

*/


/* /// TWO POINTER 

        StringBuffer sb = new StringBuffer();

        int i =0; int j=0;

        while( j<chars.length)
        {
            if(chars[i]==chars[j])
            {
                if(j+1 ==chars.length)
                {
                     sb.append(chars[i]);
                    if(((j-i)+1)>1)
                    {
                        sb.append((j-i)+1); 
                    }
                    break;
                
                }
                else
                {
                    j++; 
                }
               
            }
            else
            {
                sb.append(chars[i]);
                if((j-i)>1)
                {
                   sb.append(j-i); 
                }
                
                i=j;
                
            }
        }
                

         // modifying the chars 
         int len = sb.length();

        for(int k =0;k<len;k++)
        {
            chars[k]=sb.charAt(k);
        }
        return len;

        */


        /// TIME COMPLEXITY IMPROVE BY 0(N): 

        StringBuffer sb = new StringBuffer();

        char cur = chars[0];
        int count =0;

        int i =0;

        while(i<chars.length)
        {
            if(chars[i]==cur)
            {
                count++;
                i++;
            }
            else
            {
                sb.append(cur);
                if(count>1)
                {
                    sb.append(count);
                }
                cur = chars[i];
                count=0;
            }
        }

// after reaching index: 
                 sb.append(cur);
                if(count>1)
                {
                    sb.append(count);
                }

              int len = sb.length();

        for(int k =0;k<len;k++)
        {
            chars[k]=sb.charAt(k);
        }


                return len;
                

    }
}