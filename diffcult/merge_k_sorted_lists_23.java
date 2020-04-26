/**
 * @author 喻浩
 * @create 2020-04-26-10:14
 */
public class merge_k_sorted_lists_23 {
    /**
     * question url:https://leetcode-cn.com/problems/merge-k-sorted-lists/
     * question context :
     * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
     */
    class Solution {
//        public ListNode mergeKLists(ListNode[] lists) {
//            if (lists.length == 0){
//                return null;
//            }
//
//            if (lists.length == 1){
//                return lists[0];
//            }
//
//            ListNode ans = new ListNode(Integer.MIN_VALUE);
//            ans.next = lists[0];
//            ListNode pre = ans;
//            ListNode cur = ans.next;
//            ListNode temp;
//
//            for (int i = 1; i < lists.length; i++) {
//                ListNode node = lists[i];
//                while (node != null){
//                    while (cur != null){
//                        if (cur.val >= node.val){
//                            temp = new ListNode(node.val);
//                            pre.next = temp;
//                            temp.next = cur;
//                            pre = temp;
//                            break;
//                        } else if (cur.next == null){
//                            temp = new ListNode(node.val);
//                            cur.next = temp;
//                            break;
//                        } else {
//                            temp = new ListNode(node.val);
//                            temp.next = cur;
//                            pre.next = temp;
//                            cur = temp;
//                        }
//                        pre = cur;
//                        cur = cur.next;
//                    }
//
//                    if (cur == null){
//                        pre.next = node;
//                        cur = node;
//                    }
//
//                    node = node.next;
//                }
//                pre = ans;
//                cur = ans.next;
//            }
//            return ans.next;
//        }

        public ListNode mergeKLists(ListNode[] lists) {
            if(lists==null || lists.length==0) {
                return null;
            }
            //将lists[0]作为最终合并的链表，然后将list[0]和lists[1]合并成lists[0-1]
            //再将lists[0-1]和lists[2]合并，如此反复最终lists[0]就是最终结果
            ListNode res = lists[0];
            for(int i=1;i<lists.length;i++) {
                res = merge(res,lists[i]);
            }
            return res;
        }

        //合并两个有序链表
        private ListNode merge(ListNode a, ListNode b) {
            if(a==null || b==null) {
                return (a==null) ? b : a;
            }
            if(a.val<=b.val) {
                a.next = merge(a.next,b);
                return a;
            } else {
                b.next = merge(a,b.next);
                return b;
            }
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode listNode = null;
        ListNode listNode1 = new ListNode(-1);
        listNode1.next = new ListNode(5);
        listNode1.next.next = new ListNode(11);
        ListNode listNode2 = null;
        ListNode listNode3 = new ListNode(6);
        listNode1.next = new ListNode(10);


        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        ListNode node2 = new ListNode(4);
        node2.next = new ListNode(5);
        node2.next.next = new ListNode(6);
        node2.next.next.next = new ListNode(7);
//        ListNode node1 = new ListNode(1);
//        node1.next = new ListNode(4);
//        node1.next.next = new ListNode(5);
//        ListNode node2 = new ListNode(1);
//        node2.next = new ListNode(3);
//        node2.next.next = new ListNode(4);
//        ListNode[] lists = {node1,node2};
        ListNode[] lists = {listNode,listNode1, listNode2, listNode3};
        merge_k_sorted_lists_23 merge_k_sorted_lists_23 = new merge_k_sorted_lists_23();
        ListNode node = merge_k_sorted_lists_23.new Solution().mergeKLists(lists);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
