class Solution {
    public void rotate(int[][] matrix) {

        

        int n = matrix.length;
        int m = matrix[0].length;

        // transpose the matrix : 

        for(int i =0;i<n-1;i++)
        {
            for(int j =i+1;j<m;j++)
            {
                if(i != j)
                {
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
                
            }
        }

        // reverse the colms of each row :

        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m/2;j++)
            {
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[i][m-1-j];
                    matrix[i][m-1-j]=temp;
            }
        }
        
    }
}