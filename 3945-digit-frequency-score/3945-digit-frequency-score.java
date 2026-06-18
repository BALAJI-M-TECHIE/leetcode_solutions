class Solution {
    public int digitFrequencyScore(int n) {
        String a = n+"";

        int[] arr = new int[10];
        for(int i =0;i<a.length();i++)
        {
            arr[a.charAt(i)-'0']++;

        }

        int sum = 0;

        for(int i =1;i<arr.length;i++)
        {
            sum+=i*arr[i];
        }

        return sum;
        
    }
}