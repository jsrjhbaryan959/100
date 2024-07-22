package Days_100;

import java.util.Scanner;

public class containerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int start = 0;
        int end = nums.length-1;
        int maxCap = 0;
        while(start < end){
            int height = Math.min(nums[start], nums[end]);
            int width = end - start;
            int currCap = height * width;

            maxCap = Math.max(currCap, maxCap);

            if(nums[start] < nums[end]){
                start++;
            }
            else{
                end--;
            }
        }
        System.out.println(maxCap);
    }
}
