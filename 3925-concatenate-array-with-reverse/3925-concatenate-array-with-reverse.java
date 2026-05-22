class Solution {
    public int[] concatWithReverse(int[] nums) {

        int[] newarr = new int[2*nums.length];

        int i =0;
        for(int x : nums)
        {
            newarr[i] = x;
            i++;
        }

        for(int j = nums.length-1 ; j>=0;j--)
        {
            newarr[i]=nums[j];
            i++;
        }
        return newarr;
    }
}