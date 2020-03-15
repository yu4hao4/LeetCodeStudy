package diffcult;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 喻浩
 * @create 2020-03-14-21:56
 */
public class xu_lie_hua_er_cha_shu_lcof_mianshi37_no {
    /**
     * question url:https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof/
     * question context :
     * 请实现两个函数，分别用来序列化和反序列化二叉树。
     */
    class Solution {

    }

    public static void main(String[] args) {
//        xu_lie_hua_er_cha_shu_lcof_mianshi37 xu_lie_hua_er_cha_shu_lcof_mianshi37 = new xu_lie_hua_er_cha_shu_lcof_mianshi37();
//        System.out.println(xu_lie_hua_er_cha_shu_lcof_mianshi37.new Solution());;

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

        new Codec().serialize(node1);
    }
}

class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null){
            return "[null]";
        }

        StringBuilder str = new StringBuilder("[");
        str.append(root.val).append(",");

        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.removeFirst();
            if (node.val != Integer.MIN_VALUE){
                str.append(node.val).append(",");
            }else {
                str.append("null").append(",");
            }

            if (node.left != null){
                queue.addLast(node.left);
            }
            if (node.right != null){
                queue.addLast(node.right);
            }
            if (node.val != Integer.MIN_VALUE && node.left == null){
                queue.addLast(new TreeNode(Integer.MIN_VALUE));
            }
            if (node.val != Integer.MIN_VALUE && node.right == null){
                queue.addLast(new TreeNode(Integer.MIN_VALUE));
            }
        }
        str.delete(str.lastIndexOf(","), str.length()).append("]");
        System.out.println(str);
        return String.valueOf(str);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return null;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
