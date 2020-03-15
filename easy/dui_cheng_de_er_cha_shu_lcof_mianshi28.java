package easy;

import java.util.ArrayList;

/**
 * @author 喻浩
 * @create 2020-03-09-12:55
 * 没写完
 */
public class dui_cheng_de_er_cha_shu_lcof_mianshi28 {
    /**
     * question url:https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
     * question context :
     * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
     *
     * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
     */
    class Solution {
//        public boolean isSymmetric(TreeNode root) {
//            ArrayList<TreeNode> leftList = new ArrayList();
//            ArrayList<TreeNode> rightList = new ArrayList();
//            leftTravel(root, leftList);
//            rightTravel(root, rightList);
//
//            if (leftList.size() != rightList.size()){
//                return false;
//            }
//
//            for (int i = 0; i < leftList.size(); i++) {
//                if (leftList.get(i).val != rightList.get(i).val){
//                    return false;
//                }
//            }
//
//            return true;
//        }
//
//        public void leftTravel(TreeNode node, ArrayList leftList){
//            if (node.left != null){
//                leftTravel(node.left,leftList);
//            }
//            leftList.add(node);
//            if (node.right != null){
//                leftTravel(node.right,leftList);
//            }
//        }
//
//        public void rightTravel(TreeNode node, ArrayList rightList){
//            if (node.right != null){
//                leftTravel(node.right,rightList);
//            }
//            rightList.add(node);
//            if (node.left != null){
//                leftTravel(node.left,rightList);
//            }
//        }
        public boolean isSymmetric(TreeNode root) {
            return root == null || judge(root.left, root.right);
        }

        public boolean judge(TreeNode left,TreeNode right){
            if (left == null && right == null) {
                return true;
            }

            if (left == null || right == null ||left.val != right.val){
                return false;
            }

            return judge(left.left,right.right) && judge(left.right,right.left);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        dui_cheng_de_er_cha_shu_lcof_mianshi28 dui_cheng_de_er_cha_shu_lcof_mianshi28 = new dui_cheng_de_er_cha_shu_lcof_mianshi28();
        System.out.println(dui_cheng_de_er_cha_shu_lcof_mianshi28.new Solution().isSymmetric(node1));;
    }
}
