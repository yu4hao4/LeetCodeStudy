package medium;

import java.util.ArrayList;

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
            ans.next = head;
            ListNode temp = ans;
            ListNode node1;
            ListNode node2;
            while (temp.next != null && temp.next.next != null){
                node1 = temp.next;
                node2 = temp.next.next;

                temp.next = node2;
                node1.next = node2.next;
                node2.next = node1;

                temp = node1;
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
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
        swap_nodes_in_pairs_24 swap_nodes_in_pairs_24 = new swap_nodes_in_pairs_24();

        ListNode listNode = swap_nodes_in_pairs_24.new Solution().swapPairs(node);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}
