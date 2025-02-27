class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int min=prices[0];
        for(int price:prices){
            min=Math.min(min,price);
            maxprofit = Math.max(maxprofit, price - min);
        }
        return maxprofit;
    }
}