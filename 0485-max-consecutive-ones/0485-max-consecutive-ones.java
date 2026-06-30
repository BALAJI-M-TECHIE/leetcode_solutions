class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {


        

        int left = 0;
        int right =0;
        int max = Integer.MIN_VALUE;
       

        while(right<nums.length)
        {          
              if(nums[right]==0)
              {
                max = Math.max(right-left,max); 
                left=right+1;
                right++;
                             
              }
               else
               {right++;
               }
               
                 
        }

        return Math.max(right-left,max); 

        

/*

        int count =0;
        int max=Integer.MIN_VALUE;

        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                max = Math.max(count,max);
                count=0;
            }
            else
            {
                 count++;
            }
           
        }

        return Math.max(count,max);
        */
        
    }
}