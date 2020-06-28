import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 喻浩
 * @create 2020-05-18-19:05
 */
public class Test {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (sc.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//            //物品数量
//            int num = Integer.parseInt(sc.nextLine());
//            //收益
//            int[] profits = new int[num];
//            String input = sc.nextLine();//获取用户输入
//            String[] strArr=input.split(" ");//将用户输入以字符串的形式保存到数组
//            for (int i = 0; i < strArr.length; i++) {
//                profits[i] = Integer.parseInt(strArr[i]);
//            }
//
//            //库存
//            int[] stocks = new int[num];
//            input = sc.nextLine();
//            strArr=input.split(" ");
//            for (int i = 0; i < strArr.length; i++) {
//                stocks[i] = Integer.parseInt(strArr[i]);
//            }
//            ArrayList<Integer> list = new ArrayList();
//            for (int i = 0; i < stocks.length; i++) {
//                while (stocks[i] > 0){
//                    list.add(profits[i]);
//                    stocks[i]--;
//                }
//            }
//
//            Object[] array = list.toArray();
//            Arrays.sort(array);
//
//            int index = array.length-1;
//            int ans = 0;
//            while (num > 0){
//                ans += num * (int)array[index];
//                index--;
//                num--;
//            }
//
//            System.out.println(ans);
//        }
//
//    }



}
