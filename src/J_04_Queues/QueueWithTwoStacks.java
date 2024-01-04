package J_04_Queues;

import java.util.Stack;

public class QueueWithTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int val){
        stack1.push(val);
    }
    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();
        moveStack12Stack2();
        return stack2.pop();
    }

    public  int peek(){
        if(isEmpty())
            throw new IllegalStateException();
        moveStack12Stack2();
        return stack2.peek();
    }

    private void moveStack12Stack2() {
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
    }

    public boolean isEmpty(){
        return (stack2.empty() && stack1.empty());
    }
}
