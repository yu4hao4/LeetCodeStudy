package easy;

/**
 * @author yuhao5
 * @date 2020-07-03
 */
public class convert_sorted_array_to_binary_search_tree_108 {
    /**
     * question url:
     * question context :
     */
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null || nums.length == 0){
                return null;
            }

            return dfs(nums,0,nums.length-1);
        }

        private TreeNode dfs(int[] nums, int begin, int end){
            if (begin > end){
                return null;
            }

            int mid = (end+begin) >> 1;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = dfs(nums, begin, mid-1);
            node.right = dfs(nums, mid+1, end);
            return node;
        }
    }

    public static void main(String[] args) {
        convert_sorted_array_to_binary_search_tree_108 convert_sorted_array_to_binary_search_tree_108 = new convert_sorted_array_to_binary_search_tree_108();
        System.out.println(convert_sorted_array_to_binary_search_tree_108.new Solution());;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
