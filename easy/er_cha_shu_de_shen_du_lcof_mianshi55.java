package easy;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 喻浩
 * @create 2020-02-14-11:55
 */
public class er_cha_shu_de_shen_du_lcof_mianshi55 {
    /**
     * question url:https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
     * question context :
     * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
     */
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root != null){
                int left = maxDepth(root.left);
                int right = maxDepth(root.right);
                return left > right ? left+1 : right+1;
            }
            return 0;
        }

    }
    
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        er_cha_shu_de_shen_du_lcof_mianshi55 er_cha_shu_de_shen_du_lcof_mianshi55 = new er_cha_shu_de_shen_du_lcof_mianshi55();
        System.out.println(er_cha_shu_de_shen_du_lcof_mianshi55.new Solution());;
    }
}
