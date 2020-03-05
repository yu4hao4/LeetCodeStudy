package medium;

/**
 * @author 喻浩
 * @create 2020-03-02-15:27
 */
public class er_cha_sou_suo_shu_yu_shuang_xiang_lian_biao_lcof_mianshi36 {
    /**
     * question url:https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/
     * question context :
     * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。
     */
    class Solution {
        private Node head = null;
        private Node current = null;
        public Node treeToDoublyList(Node root) {
            if (root == null){
                return root;
            }
            midTravelTree(root);
            current.right = head;
            head.left = current;
            return head;
        }

        /**
         * 中序遍历
         * @param node
         */
        public void midTravelTree(Node node){
            if (node.left != null){
                midTravelTree(node.left);
            }
            if (head == null){
                head = node;
                current = head;
            }else {
                node.left = current;
                current.right = node;
                current = node;
            }
            if (node.right != null){
                midTravelTree(node.right);
            }

        }
    }

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    public static void main(String[] args) {
        er_cha_sou_suo_shu_yu_shuang_xiang_lian_biao_lcof_mianshi36 er_cha_sou_suo_shu_yu_shuang_xiang_lian_biao_lcof_mianshi36 = new er_cha_sou_suo_shu_yu_shuang_xiang_lian_biao_lcof_mianshi36();
        System.out.println(er_cha_sou_suo_shu_yu_shuang_xiang_lian_biao_lcof_mianshi36.new Solution());;
    }
}
