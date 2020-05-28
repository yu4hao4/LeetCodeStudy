package medium;

/**
 * @author 喻浩
 * @create 2020-05-24-19:04
 */
public class partition_list_86 {
    /**
     * question url:https://leetcode-cn.com/problems/partition-list/
     * question context :
     * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
     *
     * 你应当保留两个分区中每个节点的初始相对位置。
     */
    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode minList = new ListNode(0);
            ListNode maxList = new ListNode(0);
            ListNode min = minList;
            ListNode max = minList;
            while (head != null){
                if (head.val < x){
                    min.next = head;
                    min = head;
                } else {
                    max.next = head;
                    max = head;
                }
                head = head.next;
            }
            System.out.println(min.val);

            min.next = maxList.next;
            max.next = null;


            return minList.next;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        partition_list_86 partition_list_86 = new partition_list_86();
        System.out.println(partition_list_86.new Solution());;
    }
}
