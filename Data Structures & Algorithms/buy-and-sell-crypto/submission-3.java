class Solution {
    public int maxProfit(int[] prices) {
        int maxDiff = 0;
        int esquerda = 0;
        int direita = prices.length-1;
        int[] minEsquerda = new int[prices.length];
        int[] maxDireita = new int[prices.length];
        minEsquerda[0] = prices[0];
        maxDireita[prices.length-1] = prices[prices.length-1];

        for(int i=1;i<prices.length; i++) {
            if(prices[i] < minEsquerda[i-1]) {
                minEsquerda[i] = prices[i];
            } else {
                minEsquerda[i] = minEsquerda[i-1];
            }
        }   

        for(int i=prices.length-2;i>0; i--) {
            if(prices[i] > maxDireita[i+1]) {
                maxDireita[i] = prices[i];
            } else {
                maxDireita[i] = maxDireita[i+1];
            }
        }

        for(int i = 0; i<prices.length; i++) {
            int diff = maxDireita[i] - minEsquerda[i];
            if(diff>maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }
}
