package easy;

/**
 * @author 喻浩
 * @create 2019-08-28-16:00
 */
public class peak_index_in_a_mountain_array_852 {
    /**
     * question url:https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
     * question context :
     * 我们把符合下列属性的数组 A 称作山脉：
     *
     * A.length >= 3
     * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
     * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
     */
    class Solution {
        public int peakIndexInMountainArray(int[] A) {
            int i,location = 0;
            int max = 0;
            for(i = 0;i < A.length;i++){
                if(A[i] > max){
                    max = A[i];
                    location = i;
                }
            }
            return location;
        }
    }
    
    public static void main(String[] args) {
        int[] A = {0,1,0};
        peak_index_in_a_mountain_array_852 peak_index_in_a_mountain_array_852 = new peak_index_in_a_mountain_array_852();
        System.out.println(peak_index_in_a_mountain_array_852.new Solution().peakIndexInMountainArray(A));;
    }
}
