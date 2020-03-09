package medium;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-03-08-13:42
 */
public class coin_change_322 {
    /**
     * question url:https://leetcode-cn.com/problems/coin-change/
     * question context :
     * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
     */
    class Solution {
//        int res = Integer.MAX_VALUE;
//        public int coinChange(int[] coins, int amount) {
//            Arrays.sort(coins);
//            greedy(coins, amount, coins.length-1, 0);
//            if (res == Integer.MAX_VALUE){
//                return -1;
//            }
//            return res;
//        }
//
//        public void greedy(int[] coins, int target, int index, int num){
//            if (target < 0){
//                return;
//            }
//
//            if (target == 0){
//                res = Math.min(num, res);
//                return;
//            }
//
//            if (coins[index] > target){
//                return;
//            }
//
//            for (int i = coins.length-1; i >= 0; i--) {
////            for (int i = index; i >= 0; i--) {
//                greedy(coins, target-coins[i],i,num+1);
//            }
//        }

        public int coinChange(int[] coins, int amount) {
            int max = amount + 1;
            int[] dp = new int[amount + 1];
            Arrays.fill(dp, max);
            dp[0] = 0;
            for (int i = 1; i <= amount; i++) {
                for (int coin : coins) {
                    if (coin <= i) {
                        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                    }
                }
            }
            return dp[amount] > amount ? -1 : dp[amount];
        }

    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
//        int[] coins = {2};
//        int[] coins = {2,5,10,1};
//        int[] coins = {186,419,83,408};
        coin_change_322 coin_change_322 = new coin_change_322();
        System.out.println(coin_change_322.new Solution().coinChange(coins,11));
    }
}
