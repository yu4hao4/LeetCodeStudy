package easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-03-06-17:36
 */
public class he_wei_sde_lian_xu_zheng_shu_xu_lie_lcof_mianshi57_2 {
    /**
     * question url:https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/
     * question context :
     * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
     *
     * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
     */
    class Solution {
        public int[][] findContinuousSequence(int target) {
            int len = ( target & 1) == 0 ? target >> 1 : (target >> 1) +1;
            ArrayList<ArrayList<Integer>> lists = new ArrayList();
            ArrayList<Integer> list;
            for (int i = 1; i <= len; i++) {
                int sum = i;
                list = new ArrayList<>();
                list.add(i);
                for (int j = i+1; j <= len; j++) {
                    sum += j;
                    list.add(j);
                    if (sum == target){
                        lists.add(list);
                        break;
                    }

                    if (sum > target){
                        break;
                    }
                }
            }

            int[][] result = new int[lists.size()][];
            for (int i = 0; i < lists.size(); i++) {
                ArrayList<Integer> arrayList = lists.get(i);
                int[] temp = new int[arrayList.size()];
                for (int j = 0; j < arrayList.size(); j++) {
                    temp[j] = arrayList.get(j);
                }
                result[i] = temp;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        he_wei_sde_lian_xu_zheng_shu_xu_lie_lcof_mianshi57_2 he_wei_sde_lian_xu_zheng_shu_xu_lie_lcof_mianshi57_2 = new he_wei_sde_lian_xu_zheng_shu_xu_lie_lcof_mianshi57_2();
        System.out.println(
                Arrays.deepToString(
                        he_wei_sde_lian_xu_zheng_shu_xu_lie_lcof_mianshi57_2.new Solution().findContinuousSequence(9)
                )
        );;
    }
}
