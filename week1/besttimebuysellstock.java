class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
    
        if (prices.length==1)
            return 0;
        int left = 0;
        int profit = 0;
        for(int right=1;right<=prices.length-1;right++)
        {
            if(prices[right]>prices[left])
            {
                profit = Math.max(profit,prices[right]-prices[left]);
            }
            else
            {
                left = right;
            }
        }
       
        return profit;
    }
}
