package easy;

import java.util.Stack;

/**
 * @author 喻浩
 * @create 2020-02-21-17:45
 */
public class ping_heng_er_cha_shu_lcof_mianshi55 {
    /**
     * question url:https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
     * question context :
     * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
     */
    class Solution {
//        没写完
//        public boolean isBalanced(TreeNode root) {
//            if (root == null){
//                return true;
//            }
//
//            Stack<TreeNode> leftStack = new Stack<>();
//            Stack<TreeNode> rightStack = new Stack<>();
//            TreeNode leftNode;
//            if (root.left != null){
//                leftNode = root.left;
//                leftStack.push(leftNode);
//            }
//            TreeNode rightNode;
//            if (root.right != null){
//                rightNode = root.right;
//                rightStack.push(rightNode);
//            }
//            
//            int leftDepth = 0;
//            int rightDepth = 0;
//
//            int leftNodeNum = 1;
//            int rightNodeNum = 1;
//            
//            while (!leftStack.isEmpty()){
//                TreeNode node = leftStack.pop();
//                leftNodeNum--;
//                
//                if (leftNodeNum == 0){
//                    leftDepth++;
//                }
//                
//                if (node.left!=null){
//                    leftStack.push(node.left);
//                    leftNodeNum++;
//                }
//                
//                if (node.right!=null){
//                    leftStack.push(node.right);
//                    leftNodeNum++;
//                }
//            }
//
//            while (!rightStack.isEmpty()){
//                TreeNode node = rightStack.pop();
//                rightNodeNum--;
//
//                if (rightNodeNum == 0){
//                    rightDepth++;
//                }
//
//                if (node.left!=null){
//                    rightStack.push(node.left);
//                    rightNodeNum++;
//                }
//
//                if (node.right!=null){
//                    rightStack.push(node.right);
//                    rightNodeNum++;
//                }
//            }
//            
//            return Math.abs(leftDepth - rightDepth) <= 1;
//        }




        boolean flag = true;
        public boolean isBalanced(TreeNode root) {
            if(root==null){
                return true;
            }
            height(root);
            return flag;
        }

        private int height(TreeNode root){
            if(root==null){
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);
            if(Math.abs(left-right)>1){
                flag = false;
            }
            return 1+Math.max(left, right);
        }

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
     
    
    public static void main(String[] args) {
        ping_heng_er_cha_shu_lcof_mianshi55 ping_heng_er_cha_shu_lcof_mianshi55 = new ping_heng_er_cha_shu_lcof_mianshi55();
        System.out.println(ping_heng_er_cha_shu_lcof_mianshi55.new Solution());;
    }
}
