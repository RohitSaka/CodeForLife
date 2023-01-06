class Solution {
    public int maxProfit(int[] prices) {
        
        int Minimum_Price = Integer.MAX_VALUE;
        
        int profit = 0;
        
        for(int i = 0; i < prices.length; i++){
            
            if(prices[i] < Minimum_Price){
                Minimum_Price = prices[i];
            }
            else if(prices[i] - Minimum_Price > profit){
                profit = prices[i] - Minimum_Price;
            }
        }
        
        return profit;
}
}