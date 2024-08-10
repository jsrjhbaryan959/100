package Days_100;

import java.util.HashMap;
import java.util.Scanner;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(nums[i], false);
        }

        for(int key : hm.keySet()){
            if(hm.containsKey(key-1) == false){
                hm.put(key, true);
            }
        }

        int max = 0;
        for (int key : hm.keySet()) {
            int k = 1;
            if(hm.get(key) == true){
                while (hm.containsKey(key+k) == true){
                    k++;
                }
            }

            max = Math.max(max, k);
        }
        System.out.println(max);
    }
}
