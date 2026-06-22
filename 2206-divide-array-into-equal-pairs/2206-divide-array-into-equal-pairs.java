class Solution {
    public boolean divideArray(int[] nums) {
        int[] arr = new int[501];

        for(int x : nums)
        {
            arr[x]++;
        }

        for(int y : arr)
        {
            if(y%2 ==1)
            {
                return false;
            }

        }
        return true;
        
    }
}