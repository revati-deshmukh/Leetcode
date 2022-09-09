public class MaxProfit {

    public static void main(String[] args){
        MaxProfit mp = new MaxProfit();
        int[] prices = new int[] { 1,2,3,4 };
        int result = mp.maxProfit(prices);
        System.out.println(result);

        /**
         * Example 1:
         * Input: prices = [7,1,5,3,6,4]
         * Output: 5
         * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
         * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
         *
         * Example 2:
         * Input: prices = [7,6,4,3,1]
         * Output: 0
         * Explanation: In this case, no transactions are done and the max profit = 0.
         * */
    }

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int max_profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (prices[i] - buy > max_profit) {
                max_profit = prices[i] - buy;
            }
        }
        return max_profit;

        /**
         * int profit = 0;
         *         int length = prices.length;
         *         for(int i = 0, j = length-1; i <= length/2 && j >= length/2; i++,j--){
         *             if(prices[i] < prices[j] && profit < prices[j]- prices[i])
         *                 profit = prices[j] - prices[i];
         *         }
         *
         *         return profit;
         **/
    }
}
