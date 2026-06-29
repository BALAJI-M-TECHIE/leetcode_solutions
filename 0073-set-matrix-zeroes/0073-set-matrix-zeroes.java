class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] newMatrix = new int[n+1][m+1];

        for(int i = 0;i<n;i++ )
        {
            for(int j =0;j<m;j++)
            {
                newMatrix[i+1][j+1]=matrix[i][j];
            }
        }

// iterate for marking : 


for(int i = 0;i<n;i++ )
        {
            for(int j =0;j<m;j++)
            {
                if(matrix[i][j] == 0)
                {
                    newMatrix[i+1][0]=1;
                    newMatrix[0][j+1]=1;
                }
            }
        }

        // now marking of the zero in the given matrix : 

        for(int i = 0;i<1;i++ )
        {
            for(int j =1;j<m+1;j++)
            {
                for(int k = 1;k<n+1;k++)
                {
                    for(int l = 0;l<1;l++)
                    {
                        if(newMatrix[i][j]==newMatrix[k][l] && newMatrix[i][j]==1)
                        {

                            // mark the matrix of give as 0 
                           // int [1][1] current_index = [i-1][l-1];
                            for(int d = 0;d<m;d++)
                            {
                                matrix[k-1][d]=0;
                            }
                            for(int e =0;e<n;e++)
                            {
                                matrix[e][j-1]=0;
                            }

                        }
                    }
                }
            }
        }
        
    }
}