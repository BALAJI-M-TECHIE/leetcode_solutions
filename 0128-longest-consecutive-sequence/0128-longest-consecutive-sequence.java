class Solution {
    public int longestConsecutive(int[] nums) {

        // BRUTE SORT AND CHECK : 
        if(nums.length == 0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return 1;
        }
        Arrays.sort(nums);
       // int[] arr = new int[nums.length]

        int max_count = 0;
        int count = 1;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]==(nums[i-1]))
            {
                continue;
            }
            else if(nums[i]==(nums[i-1]+1))
            {
                count++;
            }
            else
            {
                max_count = Math.max(count,max_count);
                count = 1;
            }
        }

        return Math.max(count,max_count);

        
    }
}