package Days_100;

import java.util.Scanner;

public class tribonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(0);
        }
        else if(n==1 || n==2){
            System.out.println(1);
        }
        else {
            int firstNo = 0;
            int secNo = 1;
            int thirdNo = 1;
            for (int i = 1; i <=n ; i++) {
                int fourthNo = firstNo + secNo + thirdNo;
                firstNo = secNo;
                secNo = thirdNo;
                thirdNo = fourthNo;
            }
            System.out.println(firstNo);
        }
    }
}
