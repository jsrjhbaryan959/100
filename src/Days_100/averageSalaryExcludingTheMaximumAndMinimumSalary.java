package Days_100;

import java.util.Scanner;

public class averageSalaryExcludingTheMaximumAndMinimumSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            else if(nums[i] < min){
                min = nums[i];
            }
            sum = sum + nums[i];
        }
        System.out.println((double)(sum-max-min)/(n-2));
    }
}
