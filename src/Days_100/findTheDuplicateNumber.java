package Days_100;

import java.util.Scanner;

public class findTheDuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int ele = nums[i];
            ele = Math.abs(ele);

            if (nums[ele] > 0){
                nums[ele] = -nums[ele];
            }
            else {
                ans = ele;
                break;
            }
        }
        for (int i = 0; i < n; i++){
            nums[i] = Math.abs(nums[i]);
        }
        System.out.println(ans);
    }
}
