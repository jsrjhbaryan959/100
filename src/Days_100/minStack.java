package Days_100;

import java.util.Scanner;
import java.util.Stack;

public class minStack {


    private Stack<Integer> st;
    private Stack<Integer> min;

    public minStack(){
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val){
        if(st.size()==0 || min.peek()>val){
            min.push(val);
        }
        st.push(val);
    }

    public void pop(){
        int ele1 = st.pop();
        int ele2 = min.pop();

        if (ele1 == ele2){
            min.pop();
        }
    }

    public int top(){
        return st.peek();
    }

    public int getMin(){
        return min.peek();
    }

}
