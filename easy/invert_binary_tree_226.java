package easy;

/**
 * @author 喻浩
 * @create 2019-08-24-15:50
 */
public class invert_binary_tree_226 {
    /**
     * question url:https://leetcode-cn.com/problems/invert-binary-tree/
     * question context :
     * 翻转一棵二叉树。
     */
    class Solution {
        class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }

        TreeNode temp = new TreeNode(0);
        public TreeNode invertTree(TreeNode root) {
            if(root != null){
                temp = root.left;
                root.left = root.right;
                root.right = temp;
                
                if(root.left != null){
                    invertTree(root.left);
                }
                if(root.right != null){
                    invertTree(root.right);
                }
            }
            
            
            return root;
        }
    }
    
    public static void main(String[] args) {
        invert_binary_tree_226 invert_binary_tree_226 = new invert_binary_tree_226();
        System.out.println(invert_binary_tree_226.new Solution());;
    }
}
