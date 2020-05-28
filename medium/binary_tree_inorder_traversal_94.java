package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 喻浩
 * @create 2020-05-24-19:18
 */
public class binary_tree_inorder_traversal_94 {
    /**
     * question url:https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
     * question context :
     * 给定一个二叉树，返回它的中序 遍历
     */
    class Solution {

        public List<Integer> inorderTraversal(TreeNode root) {
            if (root == null){
                return new ArrayList<>();
            }
            List<Integer> ans = new ArrayList<>();
            traversal(root,ans);
            return ans;
        }

        private void traversal(TreeNode node, List<Integer> ans){
            if (node.left != null){
                traversal(node.left,ans);
            }
            ans.add(node.val);
            if (node.right != null){
                traversal(node.right,ans);
            }
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        binary_tree_inorder_traversal_94 binary_tree_inorder_traversal_94 = new binary_tree_inorder_traversal_94();
        System.out.println(binary_tree_inorder_traversal_94.new Solution());;
    }
}
