package jv;

import java.util.Arrays;

public class BestTimeTBuyAndSellStockWithTransactionFee {
    public static void main(String[] args) {
        BestTimeTBuyAndSellStockWithTransactionFee bestTimeTBuyAndSellStockWithTransactionFee = new BestTimeTBuyAndSellStockWithTransactionFee();
        bestTimeTBuyAndSellStockWithTransactionFee.maxProfit(new int[]{9, 3, 2, 8, 4, 9}, 2);
        bestTimeTBuyAndSellStockWithTransactionFee.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3);
    }

    public int maxProfit(int[] prices, int fee) {
        int hold = -prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int toHold = Math.max(hold, profit - prices[i]);
            profit = Math.max(profit, hold + prices[i] - fee);
            hold = toHold;
        }

        return profit;
    }
}
