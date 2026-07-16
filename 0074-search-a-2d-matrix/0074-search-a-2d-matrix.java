class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = (matrix.length*matrix[0].length)-1;

        while(left<=right)
        {
            int mid = left+(right - left)/2;
            int cur_row =mid/col;
            int cur_col = (mid % col);
            int num = matrix[cur_row][cur_col];
            if( num== target)
            {
                return true;
            }
            else if(num> target)
            {
                right = mid -1;
            }
            else
            {
            left = mid + 1;
            }
        }

        return false;
    }

    // int ceil(int mid , int row)

    // {
    //     if(row == 1)
    //     {
    //         return 0;
    //     }
    //     int res ;

    //     res = mid/row;
    //     if(mid%row!=0)
    //     {
    //         res++;
    //     }
    //     return res-1;
    // }
}