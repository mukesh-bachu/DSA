package J_04_Queues;
import java.util.*;
public class ReversingQueue {
    public void reverse(Queue<Integer> queue){
        Stack<Integer> stack  = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.empty()){
            queue.add(stack.pop());
        }
    }
}
