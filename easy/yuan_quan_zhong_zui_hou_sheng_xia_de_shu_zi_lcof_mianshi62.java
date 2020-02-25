package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-02-24-18:13
 */
public class yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof_mianshi62 {
    /**
     * question url:https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/
     * question context :
     * 0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
     *
     * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
     */
    class Solution {
//        public int lastRemaining(int n, int m) {
//            long begin = System.currentTimeMillis();
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = i;
//            }
////            System.out.println(Arrays.toString(arr));
//            int index = 0;
//            int len = n;
//            int[] temp;
//            int[] temp1;
//            for (int i = 0;i < n-1;i++){
//                index += (m % len) == 0 ? len : (m % len);
////                System.out.println(index);
//                if (index > len){
//                    index = ( (index % len) == 0 ? len : (index % len) )-1;
//                }else {
//                    index = Math.max(index - 1, 0);
//                }
//
//                len--;
//                temp =  Arrays.copyOfRange(arr,0,index);
////                System.out.println(Arrays.toString(temp));
//                temp1 = Arrays.copyOfRange(arr, index+1, arr.length);
////                System.out.println(Arrays.toString(temp1));
//                arr= new int[len];
//                for (int j = 0; j < len; j++) {
//                    if (j < temp.length){
//                        arr[j] = temp[j];
//                    }else {
//                        arr[j] = temp1[j-temp.length];
//                    }
//                }
////                System.out.println(index);
////                System.out.println("len: "+len);
////                System.out.println(Arrays.toString(arr));
////                System.out.println("------------");
//            }
//            long end = System.currentTimeMillis();
//            System.out.println(end- begin);
//            return arr[0];
//        }
        
        
        
        
//        public int lastRemaining(int n, int m) {
//            long begin = System.currentTimeMillis();
//            
//            int[] arr = new int[n];
//            int index = 0;
//            int len = n;
//            for (int i = 0;i < n-1;i++){
//                index += (m % len) == 0 ? len : (m % len);
//                if (index > len){
//                    index = ( (index % len) == 0 ? len : (index % len) )-1;
//                }else {
//                    index = Math.max(index - 1, 0);
//                }
//                len--;
//                System.out.println(index);
//                int temp = index;
//                int j = -1;
//                while (temp >= 0){
//                    j = j+1 > len ? 0 : j+1;
//                    System.out.println(j);
//                    if (arr[j] == 1){
//                        continue;
//                    }
//                    temp--;
//                }
//                System.out.println("j: "+j);
//                arr[j] = 1;
//            }
//            
//            
//            long end = System.currentTimeMillis();
////            System.out.println(end- begin);
//            System.out.println(Arrays.toString(arr));
//            return 0;
//        }

//        f(n,m)=（f(n−1,m)+m)modn，且f(1,m)=0
        public int lastRemaining(int n, int m) {
            int flag = 0;
            for (int i = 2; i <= n; i++) {
                flag = (flag + m) % i;
                //动态规划的思想，将f(n,m)替换成flag存储
            }
            return flag;
        }

    }
    
    public static void main(String[] args) {
        yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof_mianshi62 yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof_mianshi62 = new yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof_mianshi62();
        System.out.println(yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof_mianshi62.new Solution().lastRemaining(5, 3));;
//        System.out.println(yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof_mianshi62.new Solution().lastRemaining(10, 17));;
//        System.out.println(yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof_mianshi62.new Solution().lastRemaining(88, 10));;
//        System.out.println(yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof_mianshi62.new Solution().lastRemaining(70866, 116922));;
    }
}
