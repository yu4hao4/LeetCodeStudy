package easy;

/**
 * @author 喻浩
 * @create 2020-03-11-10:31
 */
public class partition_array_into_three_parts_with_equal_sum_1013 {
    /**
     * question url:https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/
     * question context :
     * 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
     *
     * 形式上，如果可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分
     */
    class Solution {
        public boolean canThreePartsEqualSum(int[] A) {
            int sum = 0;
            for (int i : A) {
                sum+=i;
            }
            int num = (sum/3);
            int splitNum = 3;
            int index = 0;
            for (int i = 0; i < A.length; i++) {
                num -= A[i];
                if (num == 0){
                    splitNum--;
                    if (splitNum == 0){
                        index = i+1;
                        break;
                    }
                    num = (sum/3);
                }
            }

            for (int i = index; i < A.length; i++) {
                num += A[i];
            }
            return num == 0 && splitNum == 0;
        }
    }

    public static void main(String[] args) {
        int[] A = {12,-4,16,-5,9,-3,3,8,0};
//        int[] A = {10,-7,13,-14,30,16,-3,-16,-27,27,19};
//        int[] A = {3,3,6,5,-2,2,5,1,-9,4};
//        int[] A = {0,2,1,-6,6,7,9,-1,2,0,1};
//        int[] A = {0,2,1,-6,6,-7,9,1,2,0,1};
        partition_array_into_three_parts_with_equal_sum_1013 partition_array_into_three_parts_with_equal_sum_1013 = new partition_array_into_three_parts_with_equal_sum_1013();
        System.out.println(
                partition_array_into_three_parts_with_equal_sum_1013.new Solution().canThreePartsEqualSum(A)
        );
    }
}
