package Days_100;

import java.util.Scanner;

public class findPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        if(nums.length == 1){
            System.out.println(0);
        }
        else if(nums[0] > nums[1]){
            System.out.println(0);
        }
        else if(nums[nums.length-1] > nums[nums.length-2]){
            System.out.println(nums.length-1);
        }

        else{
            int start = 1;
            int end = nums.length-2;

            while(start <= end){
                int mid = (start + end)/2;

                if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                    System.out.println(mid);
                }
                else if (nums[mid] < nums[mid+1]) {
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
    }
}
