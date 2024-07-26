package Days_100;

import java.util.Scanner;

public class searchInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                System.out.println(mid);
            }
            else if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target < nums[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        System.out.println(-1);
    }
}
