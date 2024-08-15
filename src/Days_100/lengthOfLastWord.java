package Days_100;

import java.util.Scanner;

public class lengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        String str = sc.nextLine();

        int count = 0;

        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);

            if(ch != ' '){
                count++;
            }
            else if(count >= 1){
                break;
            }
        }
        System.out.println(count);
    }
}
