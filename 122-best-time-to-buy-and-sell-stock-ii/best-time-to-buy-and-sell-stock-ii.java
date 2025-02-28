class Solution {
    public int maxProfit(int[] prices) {
       int min=prices[0],max=0;
       for(int i=0;i<prices.length;i++){
        min=Math.min(min,prices[i]);
        max=max+(prices[i]-min);
        if(max>0)
         min=prices[i];
       }
      return max;  
    }
}