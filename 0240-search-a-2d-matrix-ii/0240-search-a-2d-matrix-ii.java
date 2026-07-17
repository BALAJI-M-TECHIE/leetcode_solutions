class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
       // APPROACHES I THINK : 
        /* 
        1 -> EITHER ITERATE FROM THE LEFT TO RIGHT OR TOP TO BOTTOM , THAT ITERATION IS O(N) IN WORST CASE : 

        SINCE LEFT TO RIGHT MEANS ITS SORTED COLMS , CHECK 0 INDEX ROW , USE BINARY SEARCH TO IMPLEMENT ;
        SINCE TOP TO BOTTOM IS SORTED ROWS, JUST BINARY SEARCH AND FIND IT : 

        KIND OF O(N * LOG(N)):  
        */

        // OPTIMAL APPROACH : START FROM THE RIGHT MOST INDEX IN ROW ,COMPARE REMOVE EITHER ROW OR COL .


        int left = 0;
        int right = matrix[0].length -1;

        while( left<matrix.length && right>-1)
        {
            int ele = matrix[left][right];
            if(ele == target)
            {
                return true;
            }
            else if(ele > target )
            {
                right --;
            }
            else if(ele<target )
            {
                left ++;
            }
        }
        return false ;
    
    }
}