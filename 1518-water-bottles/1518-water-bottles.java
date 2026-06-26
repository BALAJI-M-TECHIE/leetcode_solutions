class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int count = 0;
        int w = 0;
    
        while(numBottles>=numExchange)
        {
             count += ((numBottles/numExchange)*numExchange);
             numBottles = (numBottles-((numBottles/numExchange)*numExchange))+(numBottles/numExchange);
             
        }

        return count+numBottles;
        
    }
}