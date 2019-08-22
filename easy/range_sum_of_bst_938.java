package easy;

import java.util.Stack;

/**
 * @author 喻浩
 * @create 2019-08-20-15:55
 */
public class range_sum_of_bst_938 {
    /**
     * question url:https://leetcode-cn.com/problems/range-sum-of-bst/
     * question context :
     * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
     *
     * 二叉搜索树保证具有唯一的值。
     * 
     * 我树学的不是很好，最终这份代码的运行结果是：
     * 执行用时 :20 ms , 在所有 Java 提交中击败了 8.49% 的用户
     * 内存消耗 : 55.8 MB , 在所有 Java 提交中击败了 8.13% 的用户
     * 
     * 说实话，这结果，有点心痛，很不满意。
     * 由于是第一次刷题，暂且放过他，等第二遍再来摩擦这道题。
     * 
     * 思路的话：就是简单的遍历，我是通过栈保存右孩子，然后遍历整颗树，
     * 每次拿到一个节点，判断当前节点的值是不是在L和R中间，最后返回结果
     */
    class Solution {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int result = 0;
        public int rangeSumBST(TreeNode root, int L, int R) {
            TreeNode node = root;
            travelTree(node,L,R);
            return result;
        }
        
        public void travelTree(TreeNode node, int L, int R){
            while(node != null){
                if(node.right != null){
                    stack.push(node.right);
                }
                if(node.val >= L && node.val <= R){
                    result += node.val;
                }
                node = node.left;
            }
            
            if(!stack.isEmpty()){
                travelTree(stack.pop(), L, R);
            }
        }
    }

    static class TreeNode { 
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        
        range_sum_of_bst_938 range_sum_of_bst_938 = new range_sum_of_bst_938();
        System.out.println(range_sum_of_bst_938.new Solution().rangeSumBST(node1,1,3));;
    }
}
