package easy;

/**
 * @author 喻浩
 * @create 2020-02-12-21:04
 */
public class replace_elements_with_greatest_element_on_right_side_1299 {
    /**
     * question url:https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
     * question context :
     * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
     *
     * 完成所有替换操作后，请你返回这个数组。
     */
    class Solution {
        public int[] replaceElements(int[] arr) {
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = getMax(arr, i+1);
            }
            arr[arr.length-1] = -1;
            return arr;
        }
        
        public int getMax(int[] arr, int index){
            int max = arr[index];
            for (int i = index+1; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
            return max;
        }
    }
    
    public static void main(String[] args) {
        replace_elements_with_greatest_element_on_right_side_1299 replace_elements_with_greatest_element_on_right_side_1299 = new replace_elements_with_greatest_element_on_right_side_1299();
        System.out.println(replace_elements_with_greatest_element_on_right_side_1299.new Solution());;
    }
}
