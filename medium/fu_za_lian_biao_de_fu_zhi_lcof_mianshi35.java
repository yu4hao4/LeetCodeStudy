package medium;

import java.util.HashMap;
import java.util.Random;

/**
 * @author 喻浩
 * @create 2020-02-26-13:12
 */
public class fu_za_lian_biao_de_fu_zhi_lcof_mianshi35 {
    /**
     * question url:https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/
     * question context :
     * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
     */
    class Solution {
        public Node copyRandomList(Node head) {
            if (head==null){
                return null;
            }
            Node temp = head;
            HashMap<Node,Node> map = new HashMap<>();
            while (temp != null){
                map.put(temp, new Node(0));
                temp = temp.next;
            }

            Node result = map.get(head);
            while (head != null){
                Node node = map.get(head);
                node.val = head.val;
                node.next = map.get(head.next);
                node.random = map.get(head.random);
                head = head.next;
            }
            
            return result;
        }
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    
    public static void main(String[] args) {
        fu_za_lian_biao_de_fu_zhi_lcof_mianshi35 fu_za_lian_biao_de_fu_zhi_lcof_mianshi35 = new fu_za_lian_biao_de_fu_zhi_lcof_mianshi35();
        System.out.println(fu_za_lian_biao_de_fu_zhi_lcof_mianshi35.new Solution());;
    }
}
