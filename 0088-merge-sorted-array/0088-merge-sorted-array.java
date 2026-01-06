class Solution
 {
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        if(m == 0 )
        {
            for(int i = 0 ; i<n;i++)
            {
                nums1[i]=nums2[i];
                System.out.print(Arrays.toString(nums1));
            }
        }

         if(n == 0 )
        {
            System.out.print(Arrays.toString(nums1));
        }
        
  /*      if( n && m >1)
        {
            int i =0;  // for arr 1 
            int j =0;  // arr 2 

            while(j<n)
            {
              if(nums1[i]==nums2[j] || nums1[i]>nums2[j])
              {
                
              }
              else if (nums1[i]<nums2[j])
              {
                  i++;
              }
              
              
            }
        }

        */

if( n>0 && m >0)
{
    
   for(int i = 1 ; i <= n ; i++)
        {
            nums1[m] = nums2[i-1]; 
            m++;
        }
        Arrays.sort(nums1);
         System.out.print(Arrays.toString(nums1));
}


        
    }
}