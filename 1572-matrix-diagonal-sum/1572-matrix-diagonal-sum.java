class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n = mat.length;
         int sum_prim = 0;
         
        if(n%2 == 1)
        {
           
             for(int i =0 ;i<n;i++)
             {
                sum_prim += mat[i][i];
             } 
             for(int i = 0;i<n;i++)
             {
                if(i!=(n-1-i))
                {
                    sum_prim += mat[i][n-1-i];
                }
             }  

             

        }

        else
        {
             for(int i =0 ;i<n;i++)
             {
                sum_prim += mat[i][i];
             } 
             for(int i = 0;i<n;i++)
             {
                
                    sum_prim += mat[i][n-1-i];
                
             }  
        }
        return sum_prim;
    }
}