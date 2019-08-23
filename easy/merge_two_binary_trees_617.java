package easy;

import java.util.Stack;

/**
 * @author 喻浩
 * @create 2019-08-23-16:31
 */
public class merge_two_binary_trees_617 {
    /**
     * question url:
     * question context :
     */
    class Solution {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            TreeNode root = new TreeNode(t1.val+t2.val);
            TreeNode node;
            Stack<TreeNode> stack1 = new Stack<>();
            Stack<TreeNode> stack2 = new Stack<>();
            while(t1.left != null || t2.left != null){
                if(t1.left!=null && t2.left!= null){
                }
            }
            return t1;
        }
        
        class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }
    }
    
    public static void main(String[] args) {
        merge_two_binary_trees_617 merge_two_binary_trees_617 = new merge_two_binary_trees_617();
        System.out.println(merge_two_binary_trees_617.new Solution());;
    }
}
