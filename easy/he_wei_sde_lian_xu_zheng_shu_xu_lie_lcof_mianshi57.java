package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-02-20-15:32
 */
public class he_wei_sde_lian_xu_zheng_shu_xu_lie_lcof_mianshi57 {
    /**
     * question url:https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/
     * question context :
     * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
     *
     * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
     */
    class Solution {
        public int[][] findContinuousSequence(int target) {
            int len = target%2==0 ? target/2-1 : target/2+1;
            int[][] result = new int[len/2][];
            int m = 0;
            int[] temp = new int[len];
            for (int i = 1; i <= len; i++) {
                int k = 0;
                temp[k++] = i;
                int num = i;
                for (int j = i+1; j <= len; j++) {
                    temp[k++] = j;
                    num+=j;
                    if (num > target){
                        break;
                    }
                    if (num == target){
                        result[m++] = Arrays.copyOfRange(temp, 0, k);
                        break;
                    }
                }
            }
            return Arrays.copyOfRange(result, 0, m);
        }
    }
    
    public static void main(String[] args) {
        he_wei_sde_lian_xu_zheng_shu_xu_lie_lcof_mianshi57 he_wei_sde_lian_xu_zheng_shu_xu_lie_lcof_mianshi57 = new he_wei_sde_lian_xu_zheng_shu_xu_lie_lcof_mianshi57();
        System.out.println(
                Arrays.deepToString(he_wei_sde_lian_xu_zheng_shu_xu_lie_lcof_mianshi57.new Solution().findContinuousSequence(15))
        );
    }
}
