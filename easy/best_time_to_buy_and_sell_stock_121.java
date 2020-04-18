/**
 * @author 喻浩
 * @create 2020-03-09-11:35
 */
public class best_time_to_buy_and_sell_stock_121 {
    /**
     * question url:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
     * question context :
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     *
     * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
     *
     * 注意你不能在买入股票前卖出股票。
     */
    class Solution {
        public int maxProfit(int[] prices) {
            int res = Integer.MIN_VALUE;
            for (int i = 0; i < prices.length; i++) {
                for (int j = i+1; j < prices.length; j++) {
                    if (prices[j] - prices[i] > res){
                        res = prices[j] - prices[i];
                    }
                }
            }

            return Math.max(res, 0);
        }
    }

    public static void main(String[] args) {
        best_time_to_buy_and_sell_stock_121 best_time_to_buy_and_sell_stock_121 = new best_time_to_buy_and_sell_stock_121();
        System.out.println(best_time_to_buy_and_sell_stock_121.new Solution());;
    }
}
