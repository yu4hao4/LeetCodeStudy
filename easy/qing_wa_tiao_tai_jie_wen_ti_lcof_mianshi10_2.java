package easy;

/**
 * @author 喻浩
 * @create 2020-03-14-21:37
 */
public class qing_wa_tiao_tai_jie_wen_ti_lcof_mianshi10_2 {
    /**
     * question url:https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
     * question context :
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
     *
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     */
    class Solution {
        public int numWays(int n) {
            int a = 1,b=1;
            int sum;
            for (int i = 0; i < n; i++) {
                sum = (a+b) % 1000000007;
                a = b;
                b = sum;
            }

            return a;
        }

        public int test(int n){
            if (n == 0 || n == 1){
                return 1;
            }

            if (n > 1000000007){
                n = n % 1000000007;
            }

            return test(n-1)+test(n-2);
        }
    }

    public static void main(String[] args) {
        qing_wa_tiao_tai_jie_wen_ti_lcof_mianshi10_2 qing_wa_tiao_tai_jie_wen_ti_lcof_mianshi10_2 = new qing_wa_tiao_tai_jie_wen_ti_lcof_mianshi10_2();
        System.out.println(
                qing_wa_tiao_tai_jie_wen_ti_lcof_mianshi10_2.new Solution().numWays(7)
        );
    }
}
