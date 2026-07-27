class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i =0; i<prices.length; i++){
            for(int j = i+1; j<prices.length; j++){
                profit = Math.max(prices[j]-prices[i], profit);
            }
            
        }
        if(profit < 0){
            return 0;
        }
        return profit;
    }
}
