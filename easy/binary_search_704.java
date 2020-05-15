/**
 * @author 喻浩
 * @create 2020-05-15-21:15
 */
public class binary_search_704 {
    /**
     * question url:https://leetcode-cn.com/problems/binary-search/
     * question context :
     * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
     */
    class Solution {
        public int search(int[] nums, int target) {
            if (nums[nums.length/2] == target){
                return nums.length/2;
            }
            if (nums[nums.length/2] > target){
                for (int i = 0; i < nums.length / 2; i++) {
                    if (nums[i] == target){
                        return i;
                    }
                }
                return -1;
            }else {
                for (int i = nums.length / 2; i < nums.length; i++) {
                    if (nums[i] == target){
                        return i;
                    }
                }
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        binary_search_704 binary_search_704 = new binary_search_704();
        System.out.println(binary_search_704.new Solution());;
    }
}
