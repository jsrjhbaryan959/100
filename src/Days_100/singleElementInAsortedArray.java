package Days_100;

import java.util.Scanner;

public class singleElementInAsortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if(n == 1){
            System.out.println(nums[0]);
        }
        else if(nums[0] != nums[1]){
            System.out.println(nums[0]);
        }
        else if(nums[n-1] != nums[n-2]){
            System.out.println(n-1);
        }

        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                System.out.println(nums[mid]);
            }
            else if(mid % 2 != 0){
                if(nums[mid] == nums[mid-1]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(nums[mid] == nums[mid+1]){
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
