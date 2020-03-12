package easy;

/**
 * @author 喻浩
 * @create 2020-03-10-10:26
 */
public class diameter_of_binary_tree_543 {
    /**
     * question url:https://leetcode-cn.com/problems/diameter-of-binary-tree/
     * question context :
     * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
     */
    class Solution {
        int res;
        public int diameterOfBinaryTree(TreeNode root) {
            res = 1;
            depth(root);
            return res;
        }

        public int depth(TreeNode node){
            if (node == null){
                return 0;
            }
            int leftDepth = depth(node.left);
            int rightDepth = depth(node.right);
            res = Math.max(res, leftDepth+rightDepth+1);

            return Math.max(leftDepth, rightDepth)+1;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        diameter_of_binary_tree_543 diameter_of_binary_tree_543 = new diameter_of_binary_tree_543();
        System.out.println(diameter_of_binary_tree_543.new Solution());;
    }
}
