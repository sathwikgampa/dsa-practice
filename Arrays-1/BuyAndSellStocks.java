public class BuyAndSellStocks {
    public static int BuyAndSell(int[] prices){
        int maxProfit = 0;
        int BuyPrice = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(BuyPrice < prices[i]){
                int profit = prices[i] - BuyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                BuyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("the max profit is " + BuyAndSell(prices));
    }
}
