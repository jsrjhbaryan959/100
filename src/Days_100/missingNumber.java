package Days_100;

import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sum1 = sum1 + nums[i];
        }
        sum2 = (n* (n+1)/2);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum2 - sum1);
        }


//        for (int i = 0; i < n; i++) {
//            System.out.print(nums[i]);
//        }
    }

