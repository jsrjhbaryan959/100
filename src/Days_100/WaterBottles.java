package Days_100;

import java.util.Scanner;

public class WaterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBottles = sc.nextInt();
        int numExchange = sc.nextInt();
        int ans = numBottles;
        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;
            ans = ans + newBottles;
            numBottles = newBottles + remBottles;
        }
        System.out.println(ans);
    }
}
