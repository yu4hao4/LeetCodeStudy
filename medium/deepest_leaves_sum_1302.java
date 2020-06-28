package medium;

/**
 * @author yuhao5
 * @date 2020-06-23
 */
public class deepest_leaves_sum_1302 {
    /**
     * question url:
     * question context :
     */
    class Solution {
        int sum = 0;
        int maxDeep = 0;
        public int deepestLeavesSum(TreeNode root) {
            dfs(root, 0);
            return sum;
        }

        private void dfs(TreeNode node, int level){
            if (node == null) {
                return;
            }

            if (node.left == null && node.right == null){
                if (level > maxDeep){
                    maxDeep = level;
                    sum = node.val;
                } else if (level == maxDeep){
                    sum += node.val;
                }
            }
            dfs(node.left, level+1);
            dfs(node.right, level+1);
        }
    }

    public static void main(String[] args) {
        deepest_leaves_sum_1302 deepest_leaves_sum_1302 = new deepest_leaves_sum_1302();
        System.out.println(deepest_leaves_sum_1302.new Solution());;
    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
