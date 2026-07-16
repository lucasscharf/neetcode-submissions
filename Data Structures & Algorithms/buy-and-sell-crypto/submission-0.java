class Solution {
    public int maxProfit(int[] prices) {
        int maxDiff = 0;
        for(int i=0;i<prices.length; i++) {
            for(int j=i+1;j<prices.length; j++) {
                int diff = prices[j] - prices[i];
                if(maxDiff < diff) {
                    maxDiff = diff;
                }
            }
        }

        return maxDiff;
    }
}
