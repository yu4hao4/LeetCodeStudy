package easy;

import java.util.Stack;

/**
 * @author 喻浩
 * @create 2019-08-23-16:31
 */
public class merge_two_binary_trees_617 {
    /**
     * question url:https://leetcode-cn.com/problems/merge-two-binary-trees/
     * question context :
     * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
     *
     * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
     *
     */
    class Solution {
        class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            t1.val = t1.val + t2.val;
            TreeNode node = t1;
            return node;
        }
    }
    
    public static void main(String[] args) {
        merge_two_binary_trees_617 merge_two_binary_trees_617 = new merge_two_binary_trees_617();
        System.out.println(merge_two_binary_trees_617.new Solution());;
    }
}
