package J_04_Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackWithTwoQueues {
    private Queue<Integer> queue1 = new ArrayDeque<>();
    private Queue<Integer> queue2 = new ArrayDeque<>();
    private int top;

    public void push(int val){
        queue1.add(val);
        top = val;
    }
    //O(1)
    public int pop(){
        if(isEmpty())
            throw new IllegalStateException();

        while(queue1.size() > 1){
            top = queue1.remove();
            queue2.add(top);
        }
        swapQueues();
        return queue2.remove();
    }

    //O(1)
    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();
        return top;

    }

    private void swapQueues(){
        var tmp = queue1;
        queue1 = queue2;
        queue2 = tmp;
    }

    //O(1)
    public int size(){
        return queue1.size();
    }

    //O(1)
    public boolean isEmpty(){
        return  queue1.isEmpty();
    }

    public String toString() {
        return queue1.toString();
    }
}

