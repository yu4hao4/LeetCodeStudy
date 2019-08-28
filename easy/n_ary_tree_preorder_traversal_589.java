package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author 喻浩
 * @create 2019-08-28-15:32
 */
public class n_ary_tree_preorder_traversal_589 {
    /**
     * question url:https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
     * question context :
     * 给定一个 N 叉树，返回其节点值的前序遍历。
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
        public List<Integer> preorder(Node root) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            Stack<Node> stack = new Stack<Node>();
            if(root == null){ return list; }
            int i,len;
            Node top;
            stack.push(root);
            while(!stack.isEmpty()){
                top = stack.pop();
                len = top.children.size();
                list.add(top.val);
                for(i = len-1;i >= 0;i--){
                    stack.push(top.children.get(i));
                }
            }
            return list;
        }
    }
    
    public static void main(String[] args) {
        n_ary_tree_preorder_traversal_589 n_ary_tree_preorder_traversal_589 = new n_ary_tree_preorder_traversal_589();
        System.out.println(n_ary_tree_preorder_traversal_589.new Solution());;
    }
}
