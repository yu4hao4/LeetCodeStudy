import java.util.HashSet;
import java.util.Set;

/**
 * @author 喻浩
 * @create 2020-04-13-12:10
 */
public class linked_list_cycle_141 {
    /**
     * question url:https://leetcode-cn.com/problems/linked-list-cycle/
     * question context :
     * 给定一个链表，判断链表中是否有环。
     *
     * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环
     */
    class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null){
                return false;
            }
            Set<ListNode> set = new HashSet<>();
            while (head != null){
                if (set.contains(head)){
                    return true;
                }
                set.add(head);
                head = head.next;
            }

            return false;
        }
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        linked_list_cycle_141 linked_list_cycle_141 = new linked_list_cycle_141();
        System.out.println(linked_list_cycle_141.new Solution());;
    }
}
