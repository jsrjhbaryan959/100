package Days_100;

import java.util.Stack;

public class implementQueueUsingStacks {

    private Stack<Integer> main;
    private Stack<Integer> helper;

    public implementQueueUsingStacks(){
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x){
        //add element from main to helper
        while(main.size() > 0){
            helper.push(main.pop());
        }

        //add x to main
        main.push(x);

        //add element from helper to main
        while (helper.size() > 0){
            main.push(helper.pop());
        }
    }

    public int pop(){
        return main.pop();
    }

    public int peek() {
        return main.peek();
    }

    public boolean isEmpty(){
        return main.size() == 0;
    }


}
