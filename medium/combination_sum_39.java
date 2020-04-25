import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 喻浩
 * @create 2020-04-24-13:28
 */
public class combination_sum_39 {
    /**
     * question url:https://leetcode-cn.com/problems/combination-sum/
     * question context :
     * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
     *
     * candidates 中的数字可以无限制重复被选取。
     */
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(candidates);
            process(ans, new ArrayList(), target, candidates, 0);
            return ans;
        }

        public void process(List ans,List list,int target,int[] candidates,int start){

            if (target == 0){
                ans.add(new ArrayList<>(list));
                return;
            }

            for (int i = start; i < candidates.length; i++) {
                if (target - candidates[i] < 0){
                    break;
                }
                list.add(candidates[i]);
                process(ans, list, target - candidates[i],candidates,i);
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        combination_sum_39 combination_sum_39 = new combination_sum_39();
        List<List<Integer>> lists = combination_sum_39.new Solution().combinationSum(nums, 7);
        lists.forEach(System.out::println);
    }
}
