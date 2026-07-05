class Solution {
    public int searchInsert(int[] arr, int target) {
        
          int left = 0;
        int right = arr.length-1;
        int mid = left+((right-left)/2);
        

        if(target<arr[0])
        {
            return 0;
        }
        else if(target>arr[arr.length-1])
        {
            return arr.length;
        }
        
        /*
        while(left<=right)
        {
            
        mid = left+((right-left)/2);
        
        
        if(arr[mid]==target)
        {
                return mid;
        } 
        else if(arr[mid]>target)
        {
            
            right = mid-1;
        }
        
        else 
        {
            left = mid+1;
        }
             
        }
    
    if(arr[mid]>target)
    {
       return  mid;
    }
    return mid+1;

    */

    for(int i = 0;i<arr.length;i++)
    {
        if(arr[i]==target)
        {
            return i;
        }
        else if(target<arr[i])
        {
            return i;
        }
    }
    return 1;
    }
}