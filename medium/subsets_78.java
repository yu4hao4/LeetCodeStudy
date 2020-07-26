import java.util.ArrayList;
import java.util.List;

/**
 * @author 喻浩
 * @create 2020-07-10-22:56
 */
public class subsets_78 {
    /**
     * question url:https://leetcode-cn.com/problems/subsets/
     * question context :
     * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
     *
     * 说明：解集不能包含重复的子集。
     */
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans =  new ArrayList<>();
            ans.add(new ArrayList<>());
            if (nums == null || nums.length == 0){
                return ans;
            }

            for (int num : nums) {
                int size = ans.size();
                for (int i = 0; i < size; i++) {
                    List<Integer> list = new ArrayList<>(ans.get(i));
                    list.add(num);
                    ans.add(list);
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        subsets_78 subsets_78 = new subsets_78();
        System.out.println(subsets_78.new Solution());;
    }
}
