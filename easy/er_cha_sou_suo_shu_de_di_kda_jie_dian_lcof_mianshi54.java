package easy;

import java.util.ArrayList;

/**
 * @author 喻浩
 * @create 2020-02-20-14:38
 */
public class er_cha_sou_suo_shu_de_di_kda_jie_dian_lcof_mianshi54 {
    /**
     * question url:https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
     * question context :
     * 给定一棵二叉搜索树，请找出其中第k大的节点。
     */
    class Solution {
        public int kthLargest(TreeNode root, int k) {
            ArrayList<Integer> list = new ArrayList();
            travel(root, list);

            return list.get(k-1);
        }

        private void travel(TreeNode node, ArrayList list){
            if (node == null){
                return;
            }

            travel(node.right, list);
            list.add(node.val);
            travel(node.left, list);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        er_cha_sou_suo_shu_de_di_kda_jie_dian_lcof_mianshi54 er_cha_sou_suo_shu_de_di_kda_jie_dian_lcof_mianshi54 = new er_cha_sou_suo_shu_de_di_kda_jie_dian_lcof_mianshi54();
        System.out.println(er_cha_sou_suo_shu_de_di_kda_jie_dian_lcof_mianshi54.new Solution());;
    }
}
