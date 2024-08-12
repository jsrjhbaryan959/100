package Days_100;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class lastStoneWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stones = new int[n];

        for (int i = 0; i < n; i++) {
            stones[i] = sc.nextInt();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : stones) {
            pq.add(ele);
        }

        while (pq.size() > 1){
            int max = pq.remove();
            int smax = pq.remove();

            int nstones = max - smax;

            pq.add(nstones);
        }

        if(pq.size() == 0){
            System.out.println(0);
        }
        else {
            System.out.println(pq.remove());
        }
    }
}
