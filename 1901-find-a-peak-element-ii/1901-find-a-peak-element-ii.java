class Solution {
    public int[] findPeakGrid(int[][] mat) {

        // flatter mattrix to 1d , though it wont be in the sorted but for multiple peak its works : 

     /*    int row = mat.length;
        int col = mat[0].length;
        int left = 0;
        int right=(row*col)-1;

        while(left<=right)
        {
            int mid = left+(right-left)/2;

            int cur_row = mid/col;
            int cur_col = mid % col;

            
           // if(mat[cur_row][cur_col]<)

            int lefti = ((cur_col - 1 ) < 0)? -1 : mat[cur_row][cur_col-1];
            int righti = ((cur_col + 1 ) >= col)? -1 : mat[cur_row][cur_col+1];
            int top =((cur_row - 1 ) < 0)? -1 : mat[cur_row-1][cur_col];
            int bottom = ((cur_row + 1 ) >= col)? -1 : mat[cur_row+1][cur_col];
            
            int val = mat[cur_row][cur_col];

            if(val>lefti && val>righti && val>top && val>bottom)
            {
                return new int[]{cur_row,cur_col};

            }

           else
            {
                if(val<mid+1)
                {
                    left = mid+1;
                }
                else
                {
                    right = mid-1;
                }
            }
             


        }
         return new int[]{-1,-1}; 

         */

         // THE ABOVE IDEA WONT WORKS FOR THE CASES LIKE 
         /* 
                10 99 
                20 101

                REASON : I USE THE ABOVE CODE LIEK THAT SAME APPROACH I DID IN THE DUPLICATE PEAK ELEMENT, WEN THE MID +1  > MID THAT ON THE INCREASING SLOP WSO DEFENITELY THE PEAK IS ON THE RIGHT ELSE ON THE LEFT 

                BUT THE PROBLEM HERE IS IN 2D WE CANT DO THAT 
                LET SAY 99 IS THE MID I TOOK , WHEN COMPARE MID+1 MEANS THAT 20 WE GO TO LEFT SINCE MID+1 IS SNMALL BUT LOOK 101 IS THE PEAK ON THE RIGHT : 
            */

            // NOTE ; WE HAVE TO CONSIDE THE TOP & BOTTOM AND ALSO LEFT & RIGHT , NOT ONLY LEFT & RIGHT ELEMENT  MEANS THE ABOVE CODE ALGO IS RIGHT :  

//  OPTIMAL APPROACH : SIMPLE , GO THROUGH BINARY SEARCH FOR THE ROW OR COL , JUST FIND THE MAX ELEMENT , COMPARE LEFT AND RIGHT , NO NEED TOP & BOTTOM , BUT IF LEFT > MAX MEANS PEAK CAN BE IN LEFT OR RIGHT > MAX MEANS SOMEWHERE PEAK EXIST IN THE RIGHT : 



int left = 0 ; 
int right = mat[0].length-1;

while(left<=right)
{
    
    //chose the col; 
    int mid = left+(right -left)/2;

    int maxe = 0;
    int ind = 0;

    for(int i  = 0; i<mat.length;i++)
    {
        if(maxe<mat[i][mid])
        {
             maxe = Math.max(maxe,mat[i][mid]);
             ind = i;
        }
       
    }

int lefti = ((mid - 1 ) < 0)? -1 : mat[ind][mid-1];
int righti = ((mid + 1 ) >= mat[0].length )? -1 : mat[ind][mid+1];

    if(maxe > lefti && righti < maxe)
    {
        return new int[]{ind,mid};
    }
    else if ( maxe<lefti)
    {
        right = mid-1;
    }
    else
    {
        left = mid +1;
    }



}



return new int[]{-1,-1};
    }
}