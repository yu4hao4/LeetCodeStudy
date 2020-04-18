import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-04-15-17:34
 */
public class remove_element_27 {
    /**
     * question url:https://leetcode-cn.com/problems/remove-element/
     * question context :
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     *
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     */
    class Solution {
        public int removeElement(int[] nums, int val) {
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }
    }

    public static void main(String[] args) {
//        int[] nums = {0,1,2,2,3,0,4,2};
        int[] nums = {3,3,3};
//        int[] nums = {3,2,2,3};
        int val = 3;
        remove_element_27 remove_element_27 = new remove_element_27();
        System.out.println(remove_element_27.new Solution().removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}
