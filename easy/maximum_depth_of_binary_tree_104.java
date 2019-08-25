package easy;

import java.util.LinkedList;

/**
 * @author 喻浩
 * @create 2019-08-25-17:35
 */
public class maximum_depth_of_binary_tree_104 {
    /**
     * question url:https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
     * question context :
     * 给定一个二叉树，找出其最大深度。
     *
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     *
     * 说明: 叶子节点是指没有子节点的节点。
     */
    class Solution {
        class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }

        public int maxDepth(TreeNode root) {
            if(root == null ){
                return 0;
            }
            LinkedList<TreeNode> list = new LinkedList<TreeNode>();
            list.offer(root);
            int size = 0;
            int level = 0;
            while(!list.isEmpty()){
                int visit = 0;
                size = list.size();
                while(visit < size){
                    TreeNode node = list.poll();
                    visit++;
                    if(node.left != null){
                        list.offer(node.left);
                    }
                    if(node.right != null){
                        list.offer(node.right);
                    }
                }
                level++;
            }
            return level;
        }
    }
    
    public static void main(String[] args) {
        maximum_depth_of_binary_tree_104 maximum_depth_of_binary_tree_104 = new maximum_depth_of_binary_tree_104();
        System.out.println(maximum_depth_of_binary_tree_104.new Solution());;
    }
}
