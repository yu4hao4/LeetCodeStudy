package easy;

/**
 * @author 喻浩
 * @create 2019-08-23-15:50
 */
public class flipping_an_image_832 {
    /**
     * question url:https://leetcode-cn.com/problems/flipping-an-image/
     * question context :
     * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
     *
     * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
     *
     * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
     * 
     * 思路：
     * 首先将A数组当中的子数组提出来，设置为B，然后，for循环，双指针，一起遍历，将B数组的数据前后交换
     * 接着，当B数组的数据交换完毕之后，使用双指针，遍历，用三元表达式，因为此数组内的数据，非0即1，
     * 所以使用三元表达式，对其进行变换
     * 需要考虑一个特殊情况，那就是 i == j,因为使用的是双指针，所以当 i==j 的时候，不要对当前位置的数据进行变换
     */
    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            int temp;
            for(int a = 0;a < A.length;a++ ){
                int[] B = A[a];
                for(int i=0,j=B.length-1;i<=j;i++,j--){
                    temp = B[i];
                    B[i] = B[j];
                    B[j] = temp;
                }
                for(int i=0,j=B.length-1;i<=j;i++,j--){
                    B[i] = B[i] > 0 ?  0 : 1;
                    if(i != j){
                        B[j] = B[j] > 0 ?  0 : 1;
                    }
                }
                A[a] = B;
            }
            return A;
        }
    }
    
    public static void main(String[] args) {
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        flipping_an_image_832 flipping_an_image_832 = new flipping_an_image_832();
        System.out.println(flipping_an_image_832.new Solution().flipAndInvertImage(A).toString());;
    }
}
