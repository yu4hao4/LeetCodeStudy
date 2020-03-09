package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-03-06-18:17
 */
public class gou_jian_cheng_ji_shu_zu_lcof_mianshi66 {
    /**
     * question url:https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/
     * question context :
     * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
     */
    class Solution {
        public int[] constructArr(int[] a) {
            int[] b = new int[a.length];

            int left = 1;
            for (int i = 0; i < a.length; i++) {
                b[i] = left;
                left *= a[i];
            }

            int right = 1;
            for (int i = a.length - 1; i >= 0; i--) {
                b[i] *= right;
                right *= a[i];
            }

            return b;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        gou_jian_cheng_ji_shu_zu_lcof_mianshi66 gou_jian_cheng_ji_shu_zu_lcof_mianshi66 = new gou_jian_cheng_ji_shu_zu_lcof_mianshi66();
        System.out.println(
                Arrays.toString(
                        gou_jian_cheng_ji_shu_zu_lcof_mianshi66.new Solution().constructArr(a)
                )
        );
    }
}
