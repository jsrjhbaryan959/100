package Days_100;

import java.util.Arrays;
import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        String[] nums2 = new String[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = nums[i] + "";
        }
        Arrays.sort(nums2, (s1, s2) -> (s1+s2).compareTo(s2+s1));
        StringBuilder sb = new StringBuilder("");
        for (int i = nums2.length-1; i >=0 ; i--) {
            sb.append(nums2[i]);
        }

        if(sb.charAt(0) == '0'){
            System.out.println("0");
        }
        else{
            System.out.println(sb.toString());
        }
    }
}
