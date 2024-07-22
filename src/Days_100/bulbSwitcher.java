package Days_100;

import java.util.Scanner;

public class bulbSwitcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while (i*i <= n){
            count++;
            i++;
        }
        System.out.println(count);
    }
}
