class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i =0;
        int j = numbers.length-1;

        while(i<j)
        {

            boolean value = (numbers[i]+numbers[j])==target;
            boolean greater = (numbers[i]+numbers[j])>target;
            if(value)
            {
                return new int[]{i+1,j+1};
            }
            else
            {
                if(greater)
                {
                    j--;
                }
                else
                {
                    i++;
                }
            }
        }

        return new int[]{-1,-1};
        
    }
}