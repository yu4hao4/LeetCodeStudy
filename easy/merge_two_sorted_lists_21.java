package easy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 喻浩
 * @create 2020-03-30-12:47
 */
public class merge_two_sorted_lists_21 {
    /**
     * question url:https://leetcode-cn.com/problems/merge-two-sorted-lists/
     * question context :
     * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     */
    class Solution {
//        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//
//            ListNode ans = new ListNode(0);
//
//            ListNode temp = ans;
//            while (l1 != null && l2 != null){
//                if (l1.val >= l2.val){
//                    temp.next = l2;
//                    l2 = l2.next;
//                } else {
//                    temp.next = l1;
//                    l1 = l1.next;
//                }
//
//                temp = temp.next;
//            }
//
//            temp.next = l1 == null ? l2 : l1;
//            return ans.next;
//        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        merge_two_sorted_lists_21 merge_two_sorted_lists_21 = new merge_two_sorted_lists_21();
        System.out.println(merge_two_sorted_lists_21.new Solution());;
    }
}
