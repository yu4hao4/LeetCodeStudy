package medium;

/**
 * @author 喻浩
 * @create 2020-05-12-15:58
 */
public class swap_nodes_in_pairs_24 {
    /**
     * question url:https://leetcode-cn.com/problems/swap-nodes-in-pairs/
     * question context :
     * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
     *
     * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null){
                return null;
            }

            if (head.next == null){
                return head;
            }
            ListNode ans = new ListNode(-1);

            while (head != null){
                ListNode temp = head.next;
                ListNode node = ans;
                ans.next = head.next;
                ans.next.next = head;
                head = temp.next;
            }
            return ans.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        swap_nodes_in_pairs_24 swap_nodes_in_pairs_24 = new swap_nodes_in_pairs_24();

        ListNode listNode = swap_nodes_in_pairs_24.new Solution().swapPairs(node);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}
