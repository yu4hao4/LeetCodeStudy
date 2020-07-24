package easy;

import java.util.Arrays;

/**
 * @author yuhao5
 * @date 2020-07-22
 */
public class move_zeroes_283 {
    /**
     * question url:https://leetcode-cn.com/problems/move-zeroes/
     * question context :
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     */
    class Solution {
        public void moveZeroes(int[] nums) {
            if (nums == null || nums.length < 2){
                return;
            }

            int len = nums.length;

            for (int i = 0; i < len; i++) {
                if (nums[i] == 0){
                    for (int j = i+1; j < len; j++) {
                        if (nums[j] != 0){
                            nums[i] = nums[j];
                            nums[j] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        move_zeroes_283 move_zeroes_283 = new move_zeroes_283();
        move_zeroes_283.new Solution().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
}
