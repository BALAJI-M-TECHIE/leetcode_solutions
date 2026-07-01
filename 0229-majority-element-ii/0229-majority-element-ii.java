class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        /// MOORE'S ALGORITHM

       

        ArrayList<Integer> al = new ArrayList<>();


      for(int i = 0;i<nums.length;i++)
      {
         int count = 0 ;
         
         for(int j = 0 ;j<nums.length;j++)
         {

            if(nums[i] == nums[j]) 
                count++;
            
         
         }

         if(count>(nums.length/3) && !al.contains(nums[i]))
            {
                al.add(nums[i]);
            
               
            }
         
      }
       
      return al;
    }
}