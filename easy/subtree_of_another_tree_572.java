/**
 * @author 喻浩
 * @create 2020-05-07-20:13
 */
public class subtree_of_another_tree_572 {
    /**
     * question url:https://leetcode-cn.com/problems/subtree-of-another-tree/
     * question context :
     * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
     */
    class Solution {
        // 判断两棵二叉树是否相等
        private boolean isSame(TreeNode root1, TreeNode root2) {
            if (root1 == null) {
                return root2 == null;
            }

            if (root2 == null) {
                return false;
            }

            return root1.val == root2.val && isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
        }

        private boolean isFoundSame = false;
        private int tCount;

        // 递归计算二叉树s每棵子树的节点数，并同时寻找是否有子树与t相等
        private int calcCount(TreeNode root, TreeNode t) {
            if (isFoundSame) {
                return 0;
            }

            if (root == null) {
                return 0;
            }

            int count = calcCount(root.left, t) + calcCount(root.right, t) + 1;
            if (count == tCount && isSame(root, t)) {
                isFoundSame = true;
                return 0;
            }
            return count;
        }

        // 计算二叉树t的节点个数
        private int calcTCount(TreeNode root) {
            return root == null ? 0 : calcTCount(root.left) + calcTCount(root.right) + 1;
        }

        public boolean isSubtree(TreeNode s, TreeNode t) {
            tCount = calcTCount(t);
            calcCount(s, t);
            return isFoundSame;
        }

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        subtree_of_another_tree_572 subtree_of_another_tree_572 = new subtree_of_another_tree_572();
        System.out.println(subtree_of_another_tree_572.new Solution());;
    }
}
