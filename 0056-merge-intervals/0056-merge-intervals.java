class Solution {
    public int[][] merge(int[][] intervals) {

        int[][] arr = new int[intervals.length][2];
       Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        // List<List<Integer>> al = new ArrayList<>();
        // al.add(Arrays.asList(intervals[0][0],intervals[0][1]));

         int first = 0;
       

         

        for(int i = 0;i<intervals.length;i++)
        {
            // arr[first][0]=intervals[0][0];
            // arr[first][1]=intervals[0][1];
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(first>0 && end <= arr[first-1][1])
            {
                continue;
            }
            for(int j = i+1;j<intervals.length;j++)
            {
                if(intervals[j][0]<=end )
                {
                    end = Math.max(end,intervals[j][1]);
                }
                else
                {
                    break;
                }


            }
            arr[first][0]=start;
                    arr[first][1]=end;
                    first++;
        }

        int[][] newarr = new int[first][2];
        for(int i =0;i<first;i++)
        {
            newarr[i][0]=arr[i][0];
            newarr[i][1]=arr[i][1];
        }
        
return newarr;

    }
}