package Days_100;

import java.util.Scanner;

public class reverseWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split("\\s+");

        StringBuilder sb = new StringBuilder("");
        for (int i = arr.length-1; i >= 0 ; i--) {
            sb.append(arr[i] + " ");
        }
        String ans = sb.toString();

        System.out.println(ans.trim());
    }
}
