package Days_100;

import java.util.Scanner;
import java.util.Stack;

public class decodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> mainStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {

                int num = 0;
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    num = num * 10 + (int) (str.charAt(i) - '0');
                    i++;
                }
                i--;
                numberStack.push(num);
            } else if (ch != ']') {
                mainStack.push(ch + "");
            } else {
                String s = "";
                while (!mainStack.peek().equals("[")) {
                    str = mainStack.pop() + str;
                }
                mainStack.pop();

                int repeationNumber = numberStack.pop();

                StringBuilder sb = new StringBuilder("");

                while (repeationNumber > 0) {
                    sb.append(str);
                    repeationNumber--;
                }

                mainStack.push(sb.toString());
            }
        }
        StringBuilder ans = new StringBuilder("");
        while (mainStack.size() > 0){
            ans.insert(0, mainStack.pop());
        }
        System.out.println(ans.toString());
    }
}
