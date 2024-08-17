class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int current_profit=prices[j]-prices[i];
        //         max = Math.max(current_profit, max);
        //     }
        // }
        int buy_price=prices[0];
        for(int i=0;i<prices.length;i++){
            if(buy_price>prices[i]){
                buy_price=prices[i];
            }
            max=Math.max(max,prices[i]-buy_price);
        }
        return max;
    }
}