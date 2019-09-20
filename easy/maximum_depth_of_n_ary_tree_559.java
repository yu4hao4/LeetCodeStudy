package easy;

import java.util.*;

/**
 * @author 喻浩
 * @create 2019-09-06-11:18
 */
public class maximum_depth_of_n_ary_tree_559 {
    /**
     * question url:https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
     * question context :
     * 给定一个 N 叉树，找到其最大深度。
     *
     * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。 
     */
    class Solution {
        class Node {
            public int val;
            public List<Node> children;

            public Node() {}

            public Node(int _val,List<Node> _children) {
                val = _val;
                children = _children;
            }
        };

        public int maxDepth(Node root) {
            if(root == null){
                return 0;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            int depth = 0,len= 0 ,width,i=0;
            while (!queue.isEmpty()){
                len = queue.size();
                depth++;
                while(len > 0){
                    len--;
                    Node child = queue.poll();
                    assert child != null;
                    for(Node node : child.children){
                        if(node != null){
                            queue.add(node);
                        }
                    }
                }
            }
            return depth;
        }
    }
    
    public static void main(String[] args) {
//        maximum_depth_of_n_ary_tree_559 maximum_depth_of_n_ary_tree_559 = new maximum_depth_of_n_ary_tree_559();
//        System.out.println(maximum_depth_of_n_ary_tree_559.new Solution().maxDepth(null));;
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.remove(0));
        System.out.println(list.size());
        System.out.println(list.remove(0));
        System.out.println(list.size());
    }
}
