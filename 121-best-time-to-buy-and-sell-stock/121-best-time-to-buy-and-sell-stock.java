class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE; 
        int max = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < low){
                low = prices[i];
            }
            int profit = 0;
            profit = prices[i] - low;
            if(profit > max){
                max = profit;
            }
        }
        return max;
    }
}