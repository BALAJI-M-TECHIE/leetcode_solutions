class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
    
  /* 
        int count = 0;

     for(int i = 0;i<intervals.length;i++)
        {
            if(i<intervals.length-1 && intervals[i][0]<=intervals[i+1][0] && 
            intervals[i][1]>=intervals[i+1][1]  )
            {
                count++;
            }

             if(i>0  && intervals[i-1][0]>=intervals[i][0] && 
            intervals[i-1][1]<=intervals[i][1] )

              {
                count++;
              }
        }

        return intervals.length-count;  */

    Arrays.sort(intervals, (a, b) -> {
        if (a[0] == b[0]) {
            return Integer.compare(b[1], a[1]); // descending end
        }
        return Integer.compare(a[0], b[0]);     // ascending start
    });

    int min_left = intervals[0][0];
    int max_right = intervals[0][1];
    int ind = 0;
    int count = 0;

    for(int i = 1;i<intervals.length;i++)
    {
        if( intervals[i][1]>max_right)
        {
            min_left = intervals[i][0];
            max_right =  intervals[i][1];
            count += (i-ind - 1);
            ind = i;

        }
    }

    count += (intervals.length-ind - 1);

    return intervals.length - count;
    }
}