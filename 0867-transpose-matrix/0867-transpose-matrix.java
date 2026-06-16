class Solution {
    public int[][] transpose(int[][] matrix) {
        
        
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] new_arr = new int[col][row];

        
        for(int i =0;i<col;i++)
        {
            for(int j =0;j<row;j++)
            {
                new_arr[i][j] = matrix[j][i];
            }
        }
        
        return new_arr;
    }
}