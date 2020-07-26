package medium;

import sun.plugin.javascript.navig.Link;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yuhao5
 * @date 2020-07-24
 */
public class combination_sum_ii_40 {
    /**
     * question url:https://leetcode-cn.com/problems/combination-sum-ii/
     * question context :
     */
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            if (candidates.length < 1){
                return new ArrayList<>();
            }
            Arrays.sort(candidates);
            LinkedList<Integer> temp = new LinkedList<>();
            backtrack(target, 0, candidates.length, candidates, temp);
            return ans;
        }

        private void backtrack(int target, int start, int len, int[] candidates, LinkedList<Integer> temp){
            if (target == 0){
                ans.add(new ArrayList<>(temp));
                return;
            }

            for (int i = start; i < len; i++) {
                if (target - candidates[i] < 0){
                    return;
                }

                if (i > start && candidates[i] == candidates[i-1]){
                    continue;
                }
                temp.add(candidates[i]);
                backtrack(target - candidates[i], i+1, len, candidates, temp);
                temp.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        combination_sum_ii_40 combination_sum_ii_40 = new combination_sum_ii_40();
        List<List<Integer>> lists = combination_sum_ii_40.new Solution().combinationSum2(nums, 8);
        System.out.println(lists.toString());
    }
}
