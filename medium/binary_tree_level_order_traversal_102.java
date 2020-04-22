import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author 喻浩
 * @create 2020-04-22-10:13
 */
public class binary_tree_level_order_traversal_102 {
    /**
     * question url:https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
     * question context :
     * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null){
                return ans;
            }

            List<Integer> temp = new ArrayList<>();
            LinkedList<TreeNode> list = new LinkedList<>();
            list.addLast(root);
            int currentLevel = 1;
            int nextLevel = 0;
            while (currentLevel > 0 && !list.isEmpty()){
                currentLevel--;
                TreeNode node = list.removeFirst();
                temp.add(node.val);
                if (node.left != null){
                    nextLevel++;
                    list.addLast(node.left);
                }
                if (node.right != null){
                    nextLevel++;
                    list.addLast(node.right);
                }

                if (currentLevel == 0){
                    ans.add(temp);
                    temp = new ArrayList<>();
                    currentLevel = nextLevel;
                    nextLevel = 0;
                }
            }

            return ans;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        binary_tree_level_order_traversal_102 binary_tree_level_order_traversal_102 = new binary_tree_level_order_traversal_102();
        System.out.println(binary_tree_level_order_traversal_102.new Solution());;
    }
}
