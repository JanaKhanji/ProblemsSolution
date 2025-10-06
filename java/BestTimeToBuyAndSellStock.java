// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class BestTimeToBuyAndSellStock { 
    public static int maxProfit(int[] prices) {
        // Slow 2 For look=p
        // int maxProfit = 0;
        // for(int i = 0; i < prices.length; i++) {
        //     for (int j = i + 1; j < prices.length; j ++) {
        //         int currentMax = prices[j] - prices[i];
        //         maxProfit = Math.max(currentMax, max);
        //     }
        // }
        // return maxProfit;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
    
        for (int price : prices) {
            // update min price if current is smaller
            if (price < minPrice) {
                minPrice = price;
            } 
            // calculate profit if we sell today
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[] { 7,6,4,3,1 }));
    }
}