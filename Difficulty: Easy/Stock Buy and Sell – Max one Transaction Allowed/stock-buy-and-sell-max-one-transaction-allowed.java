class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int buyat=prices[0];
        int maxprofit=0;
        int currentprofit=0;
        
        for(int i=1;i<prices.length;i++)
        {
            buyat=Math.min(buyat,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-buyat);
            currentprofit=Math.max(currentprofit,maxprofit);
        }
        return currentprofit;
        
    }
}