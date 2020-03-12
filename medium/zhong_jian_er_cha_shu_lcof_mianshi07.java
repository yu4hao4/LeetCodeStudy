package medium;

/**
 * @author 喻浩
 * @create 2020-03-12-10:50
 */
public class zhong_jian_er_cha_shu_lcof_mianshi07 {
    /**
     * question url:https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
     * question context :
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     */
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder.length == 0){
                return null;
            }

            TreeNode node = new TreeNode(preorder[0]);
            if (preorder.length == 1){
                node.left = null;
                node.right = null;
                return node;
            }

            int nodeVal = node.val;
            int index = 0;
            for (int i = 0; i < inorder.length; i++) {
                if (nodeVal == inorder[i]){
                    index = i;
                    break;
                }
            }

            //左子树
            if (index > 0){
                int[] pre = new int[index];
                int[] in = new int[index];
                for (int i = 0; i < index; i++) {
                    pre[i] = preorder[i+1];
                }

                for (int i = 0; i < index; i++) {
                    in[i] = inorder[i];
                }

                node.left = buildTree(pre,in);
            }else {
                node.left = null;
            }

            //右子树
            if (preorder.length-index-1 > 0){
                int[] pre = new int[preorder.length-index-1];
                int[] in = new int[preorder.length-index-1];
                for (int i = index+1; i < preorder.length; i++) {
                    pre[i-index-1] = preorder[i];
                    in[i-index-1] = inorder[i];
                }
                node.right = buildTree(pre, in);
            }else {
                node.right = null;
            }

            return node;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        zhong_jian_er_cha_shu_lcof_mianshi07 zhong_jian_er_cha_shu_lcof_mianshi07 = new zhong_jian_er_cha_shu_lcof_mianshi07();
        System.out.println(zhong_jian_er_cha_shu_lcof_mianshi07.new Solution());;
    }
}
