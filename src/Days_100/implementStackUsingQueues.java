package Days_100;

import java.util.LinkedList;
import java.util.Queue;

public class implementStackUsingQueues {

    private Queue<Integer> main;
    private Queue<Integer> helper;
    public implementStackUsingQueues(){
        main = new LinkedList<>();
        helper = new LinkedList<>();

    }

    public void push(int x){
        //remove element from main and add to helper
        while (main.size() > 0){
            helper.add(main.remove());
        }

        //add element x to main queue
        main.add(x);

        //now remove element from helper and add to queue
        while (helper.size() > 0){
            main.add(helper.remove());
        }
    }

    public int pop(){
        return main.remove();
    }

    public int top(){
        return main.peek();
    }

    public boolean empty(){
        if(main.size() == 0) {
            return true;
        }
        else{
            return false;
        }
    }

}
