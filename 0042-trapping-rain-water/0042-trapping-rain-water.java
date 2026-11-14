class Solution 
{
    public int trap(int[] arr) 
    {
              ArrayList<Integer> right_al = new ArrayList<>();
                        // find the right greatest in an array :
            int greater = arr[arr.length-1];
            right_al.add(greater);
            for(int i = arr.length-2;i>=0;i--)
            {
                right_al.add(greater);
                greater = Math.max(arr[i],greater);

            }

            Collections.reverse(right_al);


            //System.out.println("sdfasdfdsafasdfsadfs");
            ArrayList<Integer> left_al = new ArrayList<>();
            int left_greater = arr[0];
            left_al.add(left_greater);
            for(int i = 1;i<arr.length;i++)
            {
                left_al.add(left_greater);
                left_greater = Math.max(arr[i],left_greater);

            }

            Collections.sort(left_al);
        

            int drop_count = 0;

            for(int i =0;i<arr.length;i++)
            {
                int min = Math.min(left_al.get(i),right_al.get(i)) - arr[i];
                if(min>0)
                {
              
                    drop_count+=min;
                }
             
            }

            return drop_count;
    }
}