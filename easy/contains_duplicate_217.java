package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuhao5
 * @date 2020-07-02
 */
public class contains_duplicate_217 {
    /**
     * question url:https://leetcode-cn.com/problems/contains-duplicate/
     * question context :
     * 给定一个整数数组，判断是否存在重复元素。
     *
     * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
     */
    class Solution {
//        public boolean containsDuplicate(int[] nums) {
//            if (nums == null || nums.length == 1){
//                return false;
//            }
//
//            for(int i = 1; i < nums.length; i++){
//                for(int j = i-1; j >= 0; j--){
//                    if(nums[i] == nums[j]){
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }
        public boolean containsDuplicate(int[] nums) {
            if (nums == null || nums.length == 1){
                return false;
            }
            Map<Integer,Integer> map = new HashMap<>(nums.length);

            for (int num : nums) {
                if (map.put(num, 1) != null) {
                    return true;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        contains_duplicate_217 contains_duplicate_217 = new contains_duplicate_217();
        System.out.println(contains_duplicate_217.new Solution());;
    }
}
