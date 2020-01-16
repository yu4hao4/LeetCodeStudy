package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 喻浩
 * @create 2020-01-16-18:47
 */
public class remove_duplicates_from_sorted_list_83 {
    /**
     * question url:https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
     * question context :
     * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode node = head;
            
            while (node != null && node.next != null){
                if(node.val == node.next.val){
                    node.next = node.next.next;
                }else {
                    node = node.next;
                }
            }
            return head;
        }
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(2);
//        ListNode node4 = new ListNode(3);
//        ListNode node5 = new ListNode(3);
        node1.next  = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = null;
        remove_duplicates_from_sorted_list_83 remove_duplicates_from_sorted_list_83 = new remove_duplicates_from_sorted_list_83();
        System.out.println(remove_duplicates_from_sorted_list_83.new Solution().deleteDuplicates(node1));;
        while (node1 != null){
            System.out.println(node1.val);
            node1 = node1.next;
        }
    }
}
