class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // nums1 + nums 2 is even length then mid with decimal values 
        // else : odd is the leng when add both arr then mid is whole value 

        int a = nums1.length;
        int b = nums2.length;
        int[] arr = new int [a+b];

        int x = 0 ;
         for(int y : nums1)
         {
            arr[x++] = y;
         }
         for(int y : nums2)
         {
            arr[x++]  = y;
         }

         Arrays.sort(arr);

        if((a+b) % 2 == 1)
        {
            return arr[(a+b)/2];
        }
         return ((double)arr[(a+b)/2]+arr[(a+b-1)/2])/2;
    }
}