package Days_100;

import java.util.Scanner;

public class fidFirstAndLastPortionOfElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int[] ans = {-1, -1};
        if(nums.length == 0){
            System.out.println(ans);
        }
        ans[0] = firstElement(nums, target);
        ans[1] = lastElement(nums, target);


    }
    public static int firstElement(int[] nums, int target){


        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                ans = mid;
                end = mid-1;
            }
            else if(target < nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;

    }

    public static int lastElement(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(target == nums[mid]){
                ans = mid;
                start = mid+1;
            }
            else if (target < nums[mid]) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }


}

