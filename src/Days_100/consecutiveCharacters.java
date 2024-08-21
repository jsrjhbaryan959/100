package Days_100;

import java.util.Scanner;

public class consecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 1;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            char previous = s.charAt(i-1);

            if(current == previous){
                count++;
            }
            else{
                max = Math.max(count, max);
                count = 1;
            }
        }
        max = Math.max(count, max);
        System.out.println(max);
    }
}
