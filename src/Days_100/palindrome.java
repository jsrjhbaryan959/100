package Days_100;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int d=0;
        while (number !=0){
            int r = number % 10;
            d = (d*10)+r;
            number/=10;

        }
        System.out.println(d);
    }
}
