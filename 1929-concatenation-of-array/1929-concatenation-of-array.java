class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];

        int i =0;
        for(int x : nums)
        {
            arr[i]=x;
            i++;
        }
         for(int x : nums)
        {
            arr[i]=x;
            i++;
        }

        return arr;
    }
}