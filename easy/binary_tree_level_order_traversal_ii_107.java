import java.util.*;

/**
 * @author 喻浩
 * @create 2020-05-21-15:01
 */
public class binary_tree_level_order_traversal_ii_107 {
    /**
     * question url:https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
     * question context :
     * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
     */
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            if (root == null){
                return new ArrayList<>();
            }

            LinkedList<List<Integer>> ans = new LinkedList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            int current = 1;
            int next = 0;
            queue.add(root);
            while (!queue.isEmpty() && current != 0){
                List<Integer> list = new ArrayList<>();
                while (current > 0){
                    TreeNode node = queue.remove();
                    list.add(node.val);
                    if (node.left != null){
                        queue.add(node.left);
                        next++;
                    }
                    if (node.right != null){
                        queue.add(node.right);
                        next++;
                    }
                    current--;
                }

                ans.addFirst(list);
                current = next;
                next = 0;
            }

            return ans;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        binary_tree_level_order_traversal_ii_107 binary_tree_level_order_traversal_ii_107 = new binary_tree_level_order_traversal_ii_107();
        Object[] objects = binary_tree_level_order_traversal_ii_107.new Solution().levelOrderBottom(node).toArray();
        System.out.println(Arrays.deepToString(objects));;
    }
}
