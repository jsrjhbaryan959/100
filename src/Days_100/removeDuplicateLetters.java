package Days_100;

import java.util.Scanner;
import java.util.Stack;

public class removeDuplicateLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] lastIndex = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = (int)(ch - 'a');

            lastIndex[index] = i;
        }

        boolean[] present = new boolean[26];

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = (int) (ch - 'a');

            if (present[index] == false) {
                while (st.size() > 0 && st.peek() > ch && (lastIndex[(int) st.peek() - 'a'] > i)) {
                    present[(int) st.peek() - 'a'] = false;
                    st.pop();
                }
                st.push(ch);
                present[index] = true;
            }
        }
        StringBuilder sb = new StringBuilder("");
        while (st.size() > 0){
            sb.append(st.pop());
        }
        System.out.println(sb.reverse().toString());
    }
}
