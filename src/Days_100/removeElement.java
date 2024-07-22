package Days_100;

import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int val = sc.nextInt();

        int pointer = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] != val){
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        System.out.println(pointer);
    }
}
