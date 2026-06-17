class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {

        int[][] ans = new int[matrix.length][matrix[0].length];
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ;j<n; j++)
            {
                if(matrix[j][i]==-1)
                {
                    int max = 0;

                    for(int k = i ; k<=i ; k++)
                    {
                     for(int l = 0 ;l<n; l++)
                         {   
                            if(matrix[l][k]>max)
                            {
                                max = matrix[l][k];
                            }
                         }
                    }
                  matrix[j][i]=max;  
                    
                }
                ans[j][i] = matrix[j][i];
            }

        }

        return ans;
        
    }
}