package medium;

import java.util.*;

/**
 * @author 喻浩
 * @create 2020-02-26-20:20
 */
public class cong_shang_dao_xia_da_yin_er_cha_shu_lcof_mianshi32 {
    /**
     * question url:https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
     * question context :
     * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
     */
    class Solution {
        public int[] levelOrder(TreeNode root) {
            if (root == null){
                return  new int[0];
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            ArrayList<Integer> list = new ArrayList();
            int currentLevel = 1;
            int nextLevel = 0;
            while (!queue.isEmpty()){
                TreeNode node = queue.poll();
                list.add(node.val);
                currentLevel--;
                if (node.left != null){
                    queue.add(node.left);
                    nextLevel++;
                }
                
                if (node.right != null){
                    queue.add(node.right);
                    nextLevel++;
                }
                
                if (currentLevel == 0){
                    currentLevel = nextLevel;
                    nextLevel = 0;
                }
            }
            
            int[] result = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            
            return result;
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
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        node.left = node1;
        node.right = node2;
        node2.left = node3;
        node2.right = node4;
        cong_shang_dao_xia_da_yin_er_cha_shu_lcof_mianshi32 cong_shang_dao_xia_da_yin_er_cha_shu_lcof_mianshi32 = new cong_shang_dao_xia_da_yin_er_cha_shu_lcof_mianshi32();
        System.out.println(
                Arrays.toString(
                        cong_shang_dao_xia_da_yin_er_cha_shu_lcof_mianshi32.new Solution().levelOrder(node)
                )
        );
    }
}
