package diffcult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuhao5
 * @date 2020-07-11
 */
public class count_of_smaller_numbers_after_self_315 {
    /**
     * question url:https://leetcode-cn.com/problems/count-of-smaller-numbers-after-self/
     * question context :
     * 给定一个整数数组 nums，按要求返回一个新数组 counts。数组 counts 有该性质： counts[i] 的值是  nums[i] 右侧小于 nums[i] 的元素的数量。
     */
    class Solution {
        public List<Integer> countSmaller(int[] nums) {
            List<Integer> ans = new ArrayList<>();
            if (nums == null || nums.length == 0){
                return ans;
            }

            if (nums.length == 1){
                ans.add(0);
                return ans;
            }

            int len = nums.length;
            for (int i = 0; i < len; i++) {
                int num = 0;
                for (int j = i+1; j < len; j++) {
                    if (nums[j] < nums[i]){
                        num++;
                    }
                }
                ans.add(num);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        count_of_smaller_numbers_after_self_315 count_of_smaller_numbers_after_self_315 = new count_of_smaller_numbers_after_self_315();
        System.out.println(count_of_smaller_numbers_after_self_315.new Solution());;
    }
}
