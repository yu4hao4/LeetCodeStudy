package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 喻浩
 * @create 2020-03-01-14:59
 */
public class cong_shang_dao_xia_da_yin_er_cha_shu_iii_lcof_mianshi32 {
    /**
     * question url:https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
     * question context :
     * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null){
                return new ArrayList<>();
            }

            List<List<Integer>> result = new ArrayList();

            List<Integer> list = new ArrayList<>();
            LinkedList<TreeNode> queue = new LinkedList();
            queue.add(root);

            int depth = 1;
            int currentLevel = 1;
            int nextLevel = 0;

            while (!queue.isEmpty()){
                TreeNode node = queue.remove(0);
                currentLevel--;
                list.add(node.val);
                if (node.left != null){
                    queue.add(node.left );
                    nextLevel++;
                }

                if (node.right != null){
                    queue.add(node.right );
                    nextLevel++;
                }

                if (currentLevel <= 0){
                    result.add(list);
                    currentLevel = nextLevel;
                    depth++;
                    nextLevel = 0;
                    list = new ArrayList<>();
                }
            }

            for (int i = 0; i < result.size(); i++) {
                if ((i & 1) == 1){
                    List<Integer> integerList = result.get(i);
                    List<Integer> newList = new LinkedList<>();
                    for (int i1 = integerList.size() - 1; i1 >= 0; i1--) {
                        newList.add(integerList.get(i1));
                    }
                    result.set(i,newList);
                }
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
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        cong_shang_dao_xia_da_yin_er_cha_shu_iii_lcof_mianshi32 cong_shang_dao_xia_da_yin_er_cha_shu_iii_lcof_mianshi32 = new cong_shang_dao_xia_da_yin_er_cha_shu_iii_lcof_mianshi32();
        System.out.println(cong_shang_dao_xia_da_yin_er_cha_shu_iii_lcof_mianshi32.new Solution().levelOrder(node1).size());;
    }
}
