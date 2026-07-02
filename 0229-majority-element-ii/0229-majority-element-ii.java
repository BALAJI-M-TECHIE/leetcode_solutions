class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        /*
       
        // simple brute approach:

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

      */

     ArrayList<Integer> al = new ArrayList<>();
      HashMap<Integer,Integer> map = new HashMap<>();

      for(int i = 0;i<nums.length;i++)
      {
        map.put(nums[i],map.getOrDefault((nums[i]),0)+1);
      }

      for(Integer x : map.keySet())
      {
        if(map.get(x)>(nums.length/3))
        {
            al.add(x);
        }

      }

      return al;
    }
}