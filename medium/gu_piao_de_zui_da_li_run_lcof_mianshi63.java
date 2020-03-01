package medium;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-02-29-15:47
 */
public class gu_piao_de_zui_da_li_run_lcof_mianshi63 {
    /**
     * question url:https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/
     * question context :
     * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
     */
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length == 0){
                return 0;
            }
            int max = 0;
            for (int i = 0; i < prices.length; i++) {
                for (int j = i; j < prices.length; j++) {
                    if ( prices[i] > prices[j]){
                        continue;
                    }
                    int profit = prices[j] - prices[i];
                    if ( profit > max){
                        max = profit;
                    }
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {
        gu_piao_de_zui_da_li_run_lcof_mianshi63 gu_piao_de_zui_da_li_run_lcof_mianshi63 = new gu_piao_de_zui_da_li_run_lcof_mianshi63();
        System.out.println(gu_piao_de_zui_da_li_run_lcof_mianshi63.new Solution());;
    }
}
