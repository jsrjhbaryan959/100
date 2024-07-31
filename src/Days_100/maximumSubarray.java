package Days_100;

import java.util.Scanner;

public class maximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        //Kadene's Algorithm

        int currentsum = nums[0];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            if(currentsum + nums[i] > nums[i]){
                currentsum+=nums[i];
            }
            else{
                currentsum=nums[i];
            }
            max = Math.max(currentsum, max);
        }
        System.out.println(max);
    }
}
