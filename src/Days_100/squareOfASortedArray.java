package Days_100;

import java.util.Arrays;
import java.util.Scanner;

public class squareOfASortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
//            nums[i] = nums[i]*nums[i];
        }

        //Method - 1 Uses More Complexity
//        for (int i = 0; i < n; i++) {
//            nums[i] = nums[i]*nums[i];
//        }

//        Arrays.sort(nums);
//        for (int i = 0; i < n; i++) {
//            System.out.print(nums[i] + " ");
//        }


//        Method 2 - Optimized as uses less complexity
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int ptr = nums.length-1;
        while(start <= end){
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];
            if(ss > es){
                ans[ptr] = ss;
                start++;
            }
            else{
                ans[ptr] = es;
                end--;
            }
            ptr--;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
