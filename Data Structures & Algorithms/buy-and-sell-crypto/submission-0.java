class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            else if (price - minPrice > maxprofit) {
                maxprofit = price - minPrice;
            }
        }
        return maxprofit;
    }
}
