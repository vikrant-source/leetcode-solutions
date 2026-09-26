class Solution {
    public int maxProfit(int[] prices) {
        int max=0;;
        int bestBuy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(bestBuy>prices[i])bestBuy=prices[i];

            max=Math.max(prices[i]-bestBuy,max);
        }
        return max;
    }
}