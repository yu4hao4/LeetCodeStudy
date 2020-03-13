package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-03-13-10:00
 */
public class fei_bo_na_qi_shu_lie_lcof_mianshi10_1 {
    /**
     * question url:https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
     * question context :
     * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
     *
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
     *
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     */
    class Solution {
        public int fib(int n) {
            if (n == 0){
                return 0;
            }
            if ( n==1 ){
                return 1;
            }

            int[] nums = new int[]{0,1};
            int temp;
            while (n > 1){
                temp = (nums[0]+nums[1])%1000000007;
                nums[0] = nums[1];
                nums[1] = temp;
                n--;
            }

            return nums[1];
        }

        public int get(int num){
            if (num == 0){
                return 0;
            }

            if (num == 1){
                return 1;
            }

            return get(num-1)+get(num-2);
        }
    }

    public static void main(String[] args) {
        fei_bo_na_qi_shu_lie_lcof_mianshi10_1 fei_bo_na_qi_shu_lie_lcof_mianshi10_1 = new fei_bo_na_qi_shu_lie_lcof_mianshi10_1();
        System.out.println(fei_bo_na_qi_shu_lie_lcof_mianshi10_1.new Solution().fib(48));

//        System.out.println(1000000008%1000000007);
    }
}
