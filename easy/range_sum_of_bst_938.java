package easy;

import java.util.Stack;

/**
 * @author 喻浩
 * @create 2019-08-20-15:55
 */
public class range_sum_of_bst_938 {
    /**
     * question url:https://leetcode-cn.com/problems/range-sum-of-bst/
     * question context :
     * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
     *
     * 二叉搜索树保证具有唯一的值。
     */
    class Solution {
        Stack stack = new Stack();
        int result = 0;
        public int rangeSumBST(TreeNode root, int L, int R) {
            TreeNode node = root;
            travelTree(node,L,R);
            return result;
        }
        
        public void travelTree(TreeNode node, int L, int R){
            while(node.left!=null){
                if(node.right != null){
                    stack.push(node.right);
                }
                if(node.left.val > L && node.left.val < R){
                    result += node.left.val;
                }
                node = node.left;
            }
        }
    }

    class TreeNode { 
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        range_sum_of_bst_938 range_sum_of_bst_938 = new range_sum_of_bst_938();
        System.out.println(range_sum_of_bst_938.new Solution());;
    }
}
