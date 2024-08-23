package Days_100;

import java.util.Scanner;
import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if (st.size() > 0 && ch == ']' && st.peek()=='[') {
                st.pop();
            }
            else if(st.size() > 0 && ch == '}' && st.peek() == '{'){
                st.pop();
            }
            else if(st.size() > 0 && ch == ')' && st.peek() == '('){
                st.pop();
            }
            else{
                System.out.println("false");
            }
        }

        if(st.size() == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
