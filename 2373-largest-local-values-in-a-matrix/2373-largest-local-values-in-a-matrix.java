class Solution 
{
    public int[][] largestLocal(int[][] grid) 
    {
        int arr_size = grid.length;
        int[][] new_arr = new int[arr_size -2][arr_size-2];


      
        for(int i =0;i<=arr_size - 3 ;i++)
        {
            for(int j =0 ; j<= arr_size - 3 ;j++)
            {
                int max = 0;
                for(int r = i ; r <i+3;r++)
                {
                    for(int c = j ; c<j+3;c++)
                    {
                       if(max<grid[r][c])
                       {
                        max = grid[r][c];
                       }
                    }
                }
                 new_arr[i][j] = max;
            }
        }

       

        return new_arr;
    }
}