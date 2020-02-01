package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 喻浩
 * @create 2020-01-30-21:05
 */
public class binary_tree_paths_257 {
    /**
     * question url:https://leetcode-cn.com/problems/binary-tree-paths/
     * question context :
     * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
     *
     * 说明: 叶子节点是指没有子节点的节点。
     */
    class Solution {
        
        public void travelTree(TreeNode node,String str,List<String> list){
            if (node != null) {
                str += String.valueOf(node.val);
                if (node.left == null && node.right == null) {
                    list.add(str);
                } else {
                    str += "->";
                    travelTree(node.left, str, list);
                    travelTree(node.right, str, list);
                }
            }
        }
        
        public List<String> binaryTreePaths(TreeNode root) {
            ArrayList<String> list = new ArrayList<>();
            travelTree(root, "", list);
            return list;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        binary_tree_paths_257 binary_tree_paths_257 = new binary_tree_paths_257();
        System.out.println(binary_tree_paths_257.new Solution());;
    }
}
