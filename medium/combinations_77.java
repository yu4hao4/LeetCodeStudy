package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuhao5
 * @date 2020-07-24
 */
public class combinations_77 {
    /**
     * question url:https://leetcode-cn.com/problems/combinations/
     * question context :
     * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
     */
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        public List<List<Integer>> combine(int n, int k) {
            if (n <= 0 || k <= 0){
                return ans;
            }

            List<Integer> temp = new ArrayList<>();
            backtrack(n, k, 1, temp);
            return ans;
        }

        private void backtrack(int n,int k,int start, List<Integer> temp){
            if (k == temp.size()){
                ans.add(new ArrayList<>(temp));
                return;
            }

            for (int i = start; i <= n; i++) {
                temp.add(i);
                backtrack(n, k, i+1, temp);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        combinations_77 combinations_77 = new combinations_77();
        System.out.println(combinations_77.new Solution());;
    }
}
