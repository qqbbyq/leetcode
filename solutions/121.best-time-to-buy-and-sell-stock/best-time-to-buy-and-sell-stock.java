public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int maxProfit = 0;
        int profit;
        int lowPrice = prices[0];
        for(int i = 1; i< prices.length; ++i){
            if(prices[i] < lowPrice){
                lowPrice = prices[i];
            } else if(prices[i] > lowPrice){
                profit = prices[i] - lowPrice;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            } 
        }
        return maxProfit;
    }
}