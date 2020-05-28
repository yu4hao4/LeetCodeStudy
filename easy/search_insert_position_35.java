/**
 * @author 喻浩
 * @create 2020-05-21-14:53
 */
public class search_insert_position_35 {
    /**
     * question url:https://leetcode-cn.com/problems/search-insert-position/
     * question context :
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     *
     * 你可以假设数组中无重复元素。
     */
    class Solution {
        public int searchInsert(int[] nums, int target) {
            if (nums.length == 0 || nums[0] > target){
                return 0;
            }

            if (nums[nums.length-1] < target){
                return nums.length;
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target){
                    return i;
                } else if (nums[i] < target && nums[i + 1] > target){
                    return i+1;
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        search_insert_position_35 search_insert_position_35 = new search_insert_position_35();
        System.out.println(search_insert_position_35.new Solution());;
    }
}
