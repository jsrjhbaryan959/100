package Days_100;

import java.util.PriorityQueue;
import java.util.Scanner;

public class kthLargestElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        // 1st Method

//        Arrays.sort(nums);
//        System.out.println(nums[n-k]);


        //2nd Method
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {

            if(pq.size() < k){
                pq.add(nums[i]);
            }
            else if (pq.peek() < nums[i]) {
                pq.remove();
                pq.add(nums[i]);
            }
        }
        System.out.println(pq.peek());
    }
}
