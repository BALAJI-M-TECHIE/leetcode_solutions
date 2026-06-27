class Solution {
    public String frequencySort(String s) {

        int[] arr = new int[123]; // make it as 1 based index //
        for(int i = 0;i<s.length();i++)
        {
            arr[s.charAt(i)]++;
        }


        StringBuffer sb = new StringBuffer();

        for(int i =0;i<arr.length;i++)
        { int max = 0;
           int ind =0;
            for( int j =0;j<arr.length;j++)
            {
                if(arr[j]>max)
                {
                    max = arr[j];
                    ind = j;
                }
            }

            for(int k =0;k<max;k++)
            {
                sb.append((char)ind);
            }

            arr[ind]=0;

            // make ind as zero
        }


return sb.toString();
        
    }
}