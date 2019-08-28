package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author 喻浩
 * @create 2019-08-27-16:07
 */
public class n_ary_tree_postorder_traversal_590 {
    /**
     * question url:https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
     * question context :
     * 给定一个 N 叉树，返回其节点值的后序遍历。
     */
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    
    class Solution {

        public List<Integer> postorder(Node root) {
            Stack<Node> stack = new Stack<Node>();
            LinkedList<Integer> list = new LinkedList<Integer>();
            if(root == null){ return list; }
            stack.push(root);
            Node top;
            int len;
            while(!stack.isEmpty()){
                top = stack.pop();
                len = top.children.size();
                list.add(0,top.val);
                for(int i = 0;i < len;i++){
                    stack.push(top.children.get(i));
                }
            }
            
            return list;
        }
        
    }
    
    public static void main(String[] args) {
        n_ary_tree_postorder_traversal_590 n_ary_tree_postorder_traversal_590 = new n_ary_tree_postorder_traversal_590();
        System.out.println(n_ary_tree_postorder_traversal_590.new Solution());;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
    }
}
