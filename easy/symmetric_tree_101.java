/**
 * @author 喻浩
 * @create 2020-06-07-16:27
 */
public class symmetric_tree_101 {
    /**
     * question url:https://leetcode-cn.com/problems/symmetric-tree/
     * question context :
     * 给定一个二叉树，检查它是否是镜像对称的。
     */
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return symmetric(root,root);
        }

        private boolean symmetric(TreeNode left, TreeNode right) {
            if (left == null && right == null){
                return true;
            }

            if (left == null || right == null){
                return false;
            }

            return left.val == right.val && symmetric(left.left, right.right) && symmetric(left.right, right.left);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        symmetric_tree_101 symmetric_tree_101 = new symmetric_tree_101();
        System.out.println(symmetric_tree_101.new Solution());;
    }
}
