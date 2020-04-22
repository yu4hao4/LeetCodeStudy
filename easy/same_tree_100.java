package easy;

/**
 * @author 喻浩
 * @create 2020-04-17-11:20
 */
public class same_tree_100 {
    /**
     * question url:https://leetcode-cn.com/problems/same-tree/
     * question context :
     * 给定两个二叉树，编写一个函数来检验它们是否相同。
     *
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     */
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null){
                return true;
            }

            assert p != null;
            if (p.val != q.val){
                return false;
            }

            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        same_tree_100 same_tree_100 = new same_tree_100();
        System.out.println(same_tree_100.new Solution());;
    }
}
