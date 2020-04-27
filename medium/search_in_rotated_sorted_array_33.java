/**
 * @author 喻浩
 * @create 2020-04-27-13:23
 */
public class search_in_rotated_sorted_array_33 {
    /**
     * question url:https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
     * question context :
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
     *
     * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
     *
     * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
     *
     * 你可以假设数组中不存在重复的元素。
     *
     * 你的算法时间复杂度必须是 O(log n) 级别。
     */
    class Solution {
        public int search(int[] nums, int target) {
            if(nums == null || nums.length == 0){
                return -1;
            }

            if (nums[0] > target){
                for (int i = nums.length - 1; i >= 0; i--) {
                    if (target == nums[i]){
                        return i;
                    }
                }
                return -1;
            }else {
                for (int i = 0; i < nums.length; i++) {
                    if (target == nums[i]){
                        return i;
                    }
                }

                return -1;
            }
        }
    }

    public static void main(String[] args) {
        search_in_rotated_sorted_array_33 search_in_rotated_sorted_array_33 = new search_in_rotated_sorted_array_33();
        System.out.println(search_in_rotated_sorted_array_33.new Solution());;
    }
}
