class Solution {
    public int maxProfit(int[] prices) {

/* WRONG APPROACH  , I FIND THE MAX AND MIN TO AND THE JUST SUBRACT IT 
        int buy_price = prices[0];
        int index = 0;

        for(int i =1;i<prices.length;i++)
        {
            if(buy_price>prices[i])
            {
                index = i;
                buy_price=prices[i];
            }
        }

        int sell_price = prices[index];
        for(int j = index+1;j<prices.length;j++)
        {
            if(sell_price<prices[j])
            {
                index = j;
                sell_price=prices[j];
            }
        }

        return sell_price - buy_price;
        

        */

        int curt_buy = prices[0];
        int max_prof = Integer.MIN_VALUE;

        for(int i =0;i<prices.length;i++)
        {
            if(prices[i]<curt_buy)
            {
                curt_buy = prices[i];
            }
            max_prof = Math.max(prices[i]-curt_buy,max_prof);
        }

return max_prof;


    }
}