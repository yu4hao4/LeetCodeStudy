import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 喻浩
 * @create 2020-05-20-19:20
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        int target = Integer.parseInt(input.split(" ")[1]);
        String[] temps = input.split(" ")[0].split(",");
        int[] nums = new int[temps.length];
        for (int i = 0; i < temps.length; i++) {
            nums[i] = Integer.parseInt(temps[i]);
        }

        int[] ans = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] == target){
                    ans = new int[]{j,i};
                }
            }
        }
        System.out.println(Arrays.toString(ans));

    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input= sc.nextLine();
//
//        String[] split = input.split(" ");
//        if (input.lastIndexOf(" ")+1 == input.length()){
//            System.out.println("null");
//        } else {
//            System.out.println(split[split.length-1]);
//        }
//
//    }
}
