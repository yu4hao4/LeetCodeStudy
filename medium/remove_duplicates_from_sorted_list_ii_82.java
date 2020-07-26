/**
 * @author 喻浩
 * @create 2020-07-02-22:50
 */
public class remove_duplicates_from_sorted_list_ii_82 {
    /**
     * question url:https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
     * question context :
     * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null){
                return head;
            }

            ListNode ans = new ListNode(-1);
            ListNode pre = ans;
            ListNode cur = head;
            pre.next = cur;

            while (cur.next != null){
                if (pre.next.val == cur.next.val){
                    while (cur.next != null){
                        cur = cur.next;
                        if (pre.next.val != cur.val){
                            pre.next = cur;
                            break;
                        }
                    }
                }else {
                    pre = pre.next;
                    cur = cur.next;
                }
            }
            return ans.next;
        }
    }

    public static void main(String[] args) {
        remove_duplicates_from_sorted_list_ii_82 remove_duplicates_from_sorted_list_ii_82 = new remove_duplicates_from_sorted_list_ii_82();
        System.out.println(remove_duplicates_from_sorted_list_ii_82.new Solution());;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
