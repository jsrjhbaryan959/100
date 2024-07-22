package Days_100;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class maximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
//        Arrays.sort(nums, Collections.reverseOrder());
//        int max = nums[0];
//        int max2 = nums[1];
//        System.out.println(max);
//        System.out.println(max2);
        int max = -1;
        int smax = -1;
        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]){
                smax = max;
                max = nums[i];
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
        System.out.println((max - 1) * (smax - 1));




        //Array Printing
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }
}
