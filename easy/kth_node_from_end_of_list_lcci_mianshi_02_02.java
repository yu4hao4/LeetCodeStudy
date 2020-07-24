package easy;

import java.util.ArrayList;

/**
 * @author yuhao5
 * @date 2020-07-14
 */
public class kth_node_from_end_of_list_lcci_mianshi_02_02 {
    /**
     * question url:https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
     * question context :
     * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
     */
    class Solution {
//        public int kthToLast(ListNode head, int k) {
//            if (head == null){
//                return -1;
//            }
//
//            ArrayList<Integer> list = new ArrayList<>();
//            while (head != null){
//                list.add(head.val);
//                head = head.next;
//            }
//
//            return list.get(list.size()-k);
//        }
        public int kthToLast(ListNode head, int k) {
            if (head == null){
                return 0;
            }

            ListNode cur = head;
            ListNode next = head;

            while (k > 0){
                if (next == null){
                    return 0;
                }
                next = next.next;
                k--;
            }

            while (next != null){
                next = next.next;
                cur = cur.next;
            }

            return cur.val;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        kth_node_from_end_of_list_lcci_mianshi_02_02 kth_node_from_end_of_list_lcci_mianshi_02_02 = new kth_node_from_end_of_list_lcci_mianshi_02_02();
        System.out.println(kth_node_from_end_of_list_lcci_mianshi_02_02.new Solution());;
    }
}
