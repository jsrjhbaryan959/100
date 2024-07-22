package Days_100;

import java.util.Scanner;

public class increasingTripletSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

//        Method 1

//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                for (int k = j+1; k < n; k++) {
//                    if(nums[i] < nums[j] && nums[j] < nums[k]){
//                        System.out.println(true);
//                    }
//                    else {
//                        System.out.println(false);
//                    }
//                }
//            }
//        }

//        Method 2
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int ele = nums[i];
            if(first >= ele){
                first = ele;
            } else if (second >= ele) {
                second = ele;
            }
            else {
                third = ele;
                System.out.println(true);
            }
        }
        System.out.println(false);
    }
}
