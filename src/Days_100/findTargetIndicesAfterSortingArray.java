package Days_100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int tcount = 0;
        int num = 0;
        for (int ele : nums) {
            if(ele == target){
                tcount++;
            }
            else if(ele < target){
                num++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        while(tcount > 0){
            ans.add(num);
            num++;
            tcount--;
        }
        System.out.println(ans);

    }
}
