package Days_100;

import java.util.Arrays;
import java.util.Scanner;

public class productOfArrayExceptItself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] right = new int[n];
        int p = 1;
        for (int i = n-1; i >=0; i--) {
            p = p * nums[i];
            right[i] = p;
        }
        int[] ans = new int[n];
        int left = 1;
        for(int i = 0;i<n-1;i++){
            int val = left * right[i+1];
            ans[i] = val;
            left = left * nums[i];
        }
        ans[n-1] = left;
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}
