class Solution {
    public boolean canAliceWin(int n) {

        if(n<10)
        {
            return false;
        }
        
        int turn = 0; // 1 means  true , even means false : 
        int red = 10;

        while(n>0)
        {
            n=n-red;
            red=red-1;
            turn++;
        
        }


        if(n<0)
        {
            return (turn%2==0);
        }
        if(turn%2==0 )
        {
            return false;
        }
        return true;

        
    }
}