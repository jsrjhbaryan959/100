package Days_100;

import java.util.Scanner;
import java.util.Stack;

public class minimumAddToMakeParenthesesValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else if (st.size() > 0 && ch == ')') {
                st.pop();
            }
            else{
                count++;
            }
        }
        System.out.println(count+st.size());
    }
}
