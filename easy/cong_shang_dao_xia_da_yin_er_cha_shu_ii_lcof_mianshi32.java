package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 喻浩
 * @create 2020-02-16-13:29
 */
public class cong_shang_dao_xia_da_yin_er_cha_shu_ii_lcof_mianshi32 {
    /**
     * question url:https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/  
     * question context :
     * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List result = new ArrayList();
            if (root == null){
                return result;
            }
            Queue<TreeNode> queue = new LinkedList();
            queue.offer(root);
            int nowLevel = 1;
            int nextLevel = 0;
            List<Integer> list = new ArrayList<>();
            while (!queue.isEmpty()){
                TreeNode node = queue.poll();
                list.add(node.val);
                nowLevel--;

                if (node.left != null){
                    queue.offer(node.left);
                    nextLevel++;
                }

                if (node.right != null){
                    queue.offer(node.right);
                    nextLevel++;
                }

                if (nowLevel == 0){
                    nowLevel=nextLevel;
                    nextLevel=0;
                    result.add(list);
                    list=new ArrayList<>();
                }
            }
            return result;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  
    }
    
    public static void main(String[] args) {
        cong_shang_dao_xia_da_yin_er_cha_shu_ii_lcof_mianshi32 cong_shang_dao_xia_da_yin_er_cha_shu_ii_lcof_mianshi32 = new cong_shang_dao_xia_da_yin_er_cha_shu_ii_lcof_mianshi32();
        System.out.println(cong_shang_dao_xia_da_yin_er_cha_shu_ii_lcof_mianshi32.new Solution());;
    }
}
