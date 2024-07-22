package Days_100;

import java.util.HashMap;
import java.util.Scanner;

public class findLuckyIntegerInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];

            if(hm.containsKey(ele) == true){
                hm.put(ele, hm.get(ele)+1);
            }
            else {
                hm.put(ele, 1);
            }
        }
        int ans = -1;
        for (int key : hm.keySet()){
            if(hm.get(key) == key){
                ans = Math.max(ans, key);
            }
        }
        System.out.println(ans);
    }
}
