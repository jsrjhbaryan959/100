package Days_100;

import java.util.Arrays;
import java.util.Scanner;

public class plusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        if(nums[nums.length-1] != 9) {
            nums[nums.length - 1] = nums[nums.length - 1] + 1;
            System.out.println(Arrays.toString(nums));
        }
        nums[nums.length-1] = 0;
        for (int i = n-2; i >= 0; i--) {
            if (nums[i] != 9) {
                nums[i] = nums[i] + 1;
                System.out.println(Arrays.toString(nums));
            }
            nums[i] = 0;
        }
        int[] arr = new int[n+1];
        arr[0] = 1;
        System.out.println(Arrays.toString(arr));
    }

}
