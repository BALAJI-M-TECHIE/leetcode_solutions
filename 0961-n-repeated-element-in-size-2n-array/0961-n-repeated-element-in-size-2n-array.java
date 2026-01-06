class Solution 
{
    public int repeatedNTimes(int[] nums)
     {
       HashSet<Integer> map = new HashSet<>();

       for(int x : nums)
       {
        if(map.contains(x))
        {
            return x;
        }
        map.add(x);
       }
return -1;
    }
}