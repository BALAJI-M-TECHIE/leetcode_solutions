class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
  

       /*
    
        // BRUTE APPROACH : NESTED 4 LOOPS 
       

      

        for(int i =0;i<nums.length;i++)
        {
            for(int j =i+1;j<nums.length;j++)
            {
                for(int k =j+1;k<nums.length;k++)
                {
                    for(int l =k+1;l<nums.length;l++)
                    {
                        int sum = nums[i]+nums[j]+nums[k]+nums[l];
                        if(sum == target)
                        {
                            ArrayList<Integer> aal = new ArrayList<>();
                            aal.add(nums[i]);
                            aal.add(nums[j]);aal.add(nums[k]);aal.add(nums[l]);
                            if(!al.contains(aal))
                            {
                                al.add(aal);
                            }
                            
                        }
                    }
                }
            }
        }

        return al;

        */

        // TRYPING THE POINTER APPROACH : 
    List<List<Integer>> al =new ArrayList<>();
   Arrays.sort(nums);

   for(int i =0;i<nums.length;i++)
   {
    if(i>0 && nums[i] == nums[i-1] )
    {
        continue;
    }
    for(int j = i+1;j<nums.length;j++)
    {

         if(j>i+1 && nums[j] == nums[j-1]  )
        {
            continue;
        }

        int k = j+1;
        int l = nums.length-1;

        while(k<l)
        {
            long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];

            if(sum == target)
            {
                ArrayList<Integer> aal = new ArrayList<>();
                aal.add(nums[i]);aal.add(nums[j]);aal.add(nums[k]);aal.add(nums[l]);
                al.add(aal);

                k++;
                 while( k<l && nums[k]==nums[k-1] )
                {
                    k++;
                }
                
                l--;
                while( k<l && nums[l]==nums[l+1] )
                {
                    l--;
                }
            }
            else if(sum<target)
            {
                k++;
                while( k<l && nums[k]==nums[k-1] )
                {
                    k++;
                }
            }
            else if(sum>target)
            {
                l--;
                while( k<l && nums[l]==nums[l+1] )
                {
                    l--;
                }
            }
        }

    }
   }
return al;
    }
}