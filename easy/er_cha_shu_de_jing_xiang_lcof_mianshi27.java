package easy;

/**
 * @author 喻浩
 * @create 2020-02-13-20:33
 */
public class er_cha_shu_de_jing_xiang_lcof_mianshi27 {
    /**
     * question url:https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
     * question context :
     * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
     */
    class Solution {
        public TreeNode mirrorTree(TreeNode root) {
            reverse(root);
            return root;
        }

        /**
         * 
         * @param node
         */
        public void reverse(TreeNode node){
            if (node == null){
                return;
            }
            if (node.left == null && node.right == null){
                return;
            }
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null){
                reverse(node.left);
            }
            if (node.right != null){
                reverse(node.right);
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
        er_cha_shu_de_jing_xiang_lcof_mianshi27 er_cha_shu_de_jing_xiang_lcof_mianshi27 = new er_cha_shu_de_jing_xiang_lcof_mianshi27();
        System.out.println(er_cha_shu_de_jing_xiang_lcof_mianshi27.new Solution());;
    }
}
