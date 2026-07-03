class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        /*  BRUTE APPROACH : 
        
        List<List<Integer>> al = new ArrayList<>();
        
        for(int i = 0 ;i<nums.length-2;i++ )
        {
            
            
            for(int j = i+1; j<nums.length-1;j++)
            {
                
               
                     for(int l = j+1;l<nums.length;l++)
                    {
                        ArrayList<Integer> aal = new ArrayList<>();
                     
                            if((nums[i]+nums[j]+nums[l]) == 0)
                            {
                                aal.add(nums[i]);
                                aal.add(nums[j]);aal.add(nums[l]);
        
                                 Collections.sort(aal);
        
                if(!al.contains(aal))
                {
                    al.add(aal);
                }
                
                            }
                        
                    }
                
               
        
               
            }
        }
        
        return al;
        
        */

        // HASHMAP 

        /*      HashMap<int[],Integer> map = new HashMap<>();
        
        for(int i =0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                
                int sum = nums[i]+nums[j];
                map.put((new int[]{i,j]}),sum);
            }
        }
        
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        
        for(int i =0;i<nums.length;i++)
        {
            if(map.containsValue(0-nums[i]))
            {
                ArrayList<Integer> aal = new ArrayList<>();
                aal.add(nums[i]);
                aal.add()
            }
        }
        
        */

/* 
        // USING THE POINNTERS APPROACH :   
        Arrays.sort(nums);

        // [-4,-1,-1, 0 , 1, 2]

        int i = 0;
        int j = i + 1;
        int k = nums.length - 1;

        List<List<Integer>> al = new ArrayList<>();

        while (i < nums.length - 2) {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum == 0) {
                ArrayList<Integer> aal = new ArrayList<>();
                aal.add(nums[i]);
                aal.add(nums[j]);
                aal.add(nums[k]);
                if(!al.contains(aal))
                {
                     al.add(aal);
                }
               
                    if ((j + 1) < k) {
                    j++;
                } else {
                    i++;
                    j = i + 1;
                    k = nums.length - 1;
                }

                while (nums[j] == nums[j - 1] && ((j + 1) < k)) {
                    j++;
                }

            }

            // else if((j+1)==k || (k-1)==j)
            // {

            // }

            else if (sum < 0) {
                if ((j + 1) < k) {
                    j++;

                    while (nums[j] == nums[j - 1] && ((j + 1) < k)) {
                    j++;
                }
                } else {
                    i++;
                    

                    while(nums[i]==nums[i-1])
                    {
                        i++;
                    }
                     j = i + 1;
                    k = nums.length - 1;
                }

                
            }

            else if (sum > 0) {
                if (k - 1 > j) 
                {
                        k--;

                    boolean val = false;
                    if(k<nums.length-1 && nums[k]==nums[k+1])
                    { val = true;}

                    while (val && ((k - 1) > j)) {
                        k--;
                }
                } else {
                    i++;
                    

                    while(nums[i]==nums[i-1] && i<nums.length-2)
                    {
                        i++;
                    }
                     j = i + 1;
                    k = nums.length - 1;
                }
                 
                
            }

        }

        return al;


        */

        List<List<Integer>> al = new ArrayList<>();
        Arrays.sort(nums);

        for(int i =0;i<nums.length-2;i++)
        {
              int j=i+1; int k = nums.length-1;
            if(i>0 && nums[i]==nums[i-1] ) continue;

         

            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];

                if(sum == 0)
                {
                    ArrayList<Integer> aal = new ArrayList<>();
                aal.add(nums[i]);
                aal.add(nums[j]);
                aal.add(nums[k]);
                al.add(aal);
                j++; while(j<k && nums[j]==nums[j-1])
                    {
                        j++;
                    }
                k--;while(k>j && nums[k]==nums[k+1])
                    {k--;}
                }

                else if(sum>0)
                {
                    k--;
                    while(k>j && nums[k]==nums[k+1])
                    {k--;}
                    
                }
                else 
                {
                    j++;
                    while(j<k && nums[j]==nums[j-1])
                    {
                        j++;
                    }
                }
            }

        }

        return al;

    }
}