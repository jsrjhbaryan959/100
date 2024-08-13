package Days_100;

import java.util.Scanner;

public class findPivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int rsum = 0;
        for (int ele : nums) {
            rsum += ele;
        }

        int lsum = 0;
        for (int i = 0; i < n; i++) {
            rsum -= nums[i];


            if(rsum == lsum){
                System.out.println(i);
            }

            lsum += nums[i];
        }
        System.out.println(-1);
    }
}
