package Days_100;

import java.util.Scanner;

public class maximumCountOfPositiveIntegerAndNegativeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int neg = 0;
        int pos = 0;

        for (int i = 0; i < n; i++) {
            if(nums[i] < 0){
                neg++;
            }
            else if(nums[i] > 0){
                pos++;
            }
        }
        System.out.println(Math.max(pos, neg));

    }
}
