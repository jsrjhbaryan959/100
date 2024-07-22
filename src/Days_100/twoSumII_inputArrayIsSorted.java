package Days_100;

import java.util.Scanner;

public class twoSumII_inputArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] arr = new int[2];

//        Method - 1
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                if(nums[i] + nums[j] == target){
//                    arr[0] = i + 1;
//                    arr[1] = j + 1;
//                    System.out.println(arr);
//                }
//                else {
//                    System.out.println(0);
//                }
//            }
//        }
//        for (int i = 0; i < 2; i++) {
//            System.out.println(arr[i]);
//        }


        int start = nums[0];
        int end = nums.length-1;
        while(start < end){
            int sum = nums[start] + nums[end];
            
            if(sum == target){
                arr[0] = start + 1;
                arr[1] = end + 1;
                System.out.println(arr);
            } else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }
        System.out.println(arr);
    }
}
