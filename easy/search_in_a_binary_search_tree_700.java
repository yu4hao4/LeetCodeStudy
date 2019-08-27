package easy;

/**
 * @author 喻浩
 * @create 2019-08-27-14:55
 */
public class search_in_a_binary_search_tree_700 {
    /**
     * question url:https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
     * question context :
     * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
     * 
     * 思路：
     * 由于题目给定的是一颗二叉搜索树，所以我们可以知道，比当前节点大的，一定在右子树，比当前节点小的，一定在左子树
     * 当题目给定的 val 等于当前节点的val时，返回当前节点下的子树。
     * 最后加上判空
     */
    class Solution {
        class TreeNode { 
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }

        public TreeNode searchBST(TreeNode root, int val) {
            if(val == root.val){
                return root;
            }else if(val > root.val){
                root = root.right;
            }else{
                root = root.left;
            }
            
            if(root == null){
                return null;
            }
            return searchBST(root, val);
        }
    
    }
    
    public static void main(String[] args) {
        search_in_a_binary_search_tree_700 search_in_a_binary_search_tree_700 = new search_in_a_binary_search_tree_700();
        System.out.println(search_in_a_binary_search_tree_700.new Solution());;
    }
}
