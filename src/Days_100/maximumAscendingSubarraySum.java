package Days_100;

import java.util.Scanner;

public class maximumAscendingSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int max = nums[0];
        int currMax = nums[0];
        for (int i = 1; i < n; i++) {
            if(nums[i-1] < nums[i]){
                currMax+=nums[i];
            }
            else{
                max=Math.max(max, currMax);
                currMax = nums[i];
            }
        }
        max = Math.max(max, currMax);
        System.out.println(max);
    }
}
