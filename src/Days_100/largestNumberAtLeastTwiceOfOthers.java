package Days_100;

import java.util.Scanner;

public class largestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int max = -1, smax = -1;
        int maxInd = 0;
        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
                maxInd = i;
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }
        if (max >= (2*smax)){
            System.out.println(maxInd);
        }
        else {
            System.out.println(-1);
        }

//        for (int i = 0; i < n; i++) {
//            if(max > (2*nums[i])){
//                System.out.println(i);
//            }
//            else {
//                System.out.println(-1);
//            }
//        }
//        System.out.println(max);
    }
}
