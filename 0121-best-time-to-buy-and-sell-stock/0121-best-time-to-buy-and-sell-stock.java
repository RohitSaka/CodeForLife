class Solution {
    public int maxProfit(int[] prices) {
        
        int minimum_Price = Integer.MAX_VALUE;
        
        int profit = 0;
        
        for(int i = 0; i < prices.length ; i++){
            if(prices[i] < minimum_Price){
                minimum_Price = prices[i];
            }
            else if(prices[i] - minimum_Price > profit){
                profit = prices[i] - minimum_Price;
            }
        }
        
        return profit;
        
    }
}