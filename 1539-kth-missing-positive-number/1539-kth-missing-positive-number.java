class Solution 
{
    public int findKthPositive(int[] arr, int k)
     {
        // linear search : 

        int find = 0;
        int x = 1;
        int i =0;

       while(x<=arr.length+k)
        {
            if((i <arr.length) &&  x!=arr[i] )
            {
                if(++find == k)
                {
                    return x;
                }x++;
            }
            else if((i <arr.length) && x == arr[i]  )
            {
                i++;
                x++;
            }
            else
            {
                break;
            }

            
            
        }
return x+(k-find)-1;

        // BINARY SEARCH ; 
       /* int len = arr.length-1;
        int maxRange = arr[len]+k;

        int left = 1;
        int right = maxRange;

        while(left<=right)
        {
            int mid = left+((right-left)/2);
            int val  = mid - len;

            if(val<k)
            {
                left = mid+1;
            }
            else if(val>k)
            {
                right = mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1; */
        
    }
}