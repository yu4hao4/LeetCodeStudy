package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 喻浩
 * @create 2020-02-29-16:37
 */
public class chou_shu_lcof_mianshi49 {
    /**
     * question url:https://leetcode-cn.com/problems/chou-shu-lcof/
     * question context :
     * 我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
     */
    class Solution {
        public int nthUglyNumber(int n) {
            int[] result = new int[2*n];
            result[0] = 1;
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            for (int i = 1; i < n; i++) {
                result[i] = Math.min(result[num1] * 2, Math.min(result[num2] * 3, result[num3] * 5));

                if (result[i] == result[num1] * 2){
                    num1++;
                }

                if (result[i] == result[num2] * 3){
                    num2++;
                }

                if (result[i] == result[num3] * 5){
                    num3++;
                }
            }

            return result[n-1];
        }

        /**
         * 判断是否是丑数
         * @param n
         * @return
         */
        public boolean isUgly(int n){
            while(n!=1){
                if(n%2 == 0){
                    n /= 2;
                }else if(n%3 == 0){
                    n /= 3;
                }else if(n%5 == 0){
                    n /= 5;
                }else{
                    break;
                }
            }
            return n==1;
        }
    }

    public static void main(String[] args) {
        chou_shu_lcof_mianshi49 chou_shu_lcof_mianshi49 = new chou_shu_lcof_mianshi49();
        System.out.println(chou_shu_lcof_mianshi49.new Solution().nthUglyNumber(3));
    }
}
