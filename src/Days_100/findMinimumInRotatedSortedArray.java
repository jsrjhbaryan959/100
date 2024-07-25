package Days_100;

import java.util.Scanner;

public class findMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if(nums.length == 1){
            System.out.println(nums[0]);
        }
        else if(nums[0] < nums[n-1]){
            System.out.println(nums[0]);
        }

        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start + end)/2;

            if(mid!=0 && nums[mid-1]>nums[mid]){
                System.out.println(nums[mid]);
                break;
            }
            else if (mid!=n-1 && nums[mid] > nums[mid+1]) {
                System.out.println(nums[mid+1]);
                break;
            }
            else if (nums[start] < nums[mid]) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
//        System.out.println(-1);
    }
}
