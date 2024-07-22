package Days_100;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            sum = sum + a;
             c = a+b;
             a = b;
             b = c;
        }
        System.out.println("Sum " + sum);
    }
}
