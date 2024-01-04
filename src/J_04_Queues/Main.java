package J_04_Queues;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(20);
        queue.add(10);
        queue.add(1);
        queue.remove();
        System.out.println(queue);
        System.out.println("*************");
//testing Reversing Queue
        ReversingQueue rQueue = new ReversingQueue();
        rQueue.reverse(queue);
        System.out.println(queue);

        System.out.println("*************");

//testing implementation of queue using array
        ArrayQueue queue1 = new ArrayQueue(5);
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);
        queue1.enqueue(5);
        System.out.println(queue1);
        queue1.dequeue();
        queue1.enqueue(6);
        queue1.dequeue();
        System.out.println(queue1);
        System.out.println("*************");
//testing QueueWithTwoStacks
        QueueWithTwoStacks queue2 = new QueueWithTwoStacks();
        queue2.enqueue(10);
        queue2.enqueue(20);
        queue2.enqueue(30);
        queue2.dequeue();
        queue2.dequeue();
        queue2.peek();
        System.out.println("*************");

//testing priority queue
        PriorityQueue queue3 = new PriorityQueue();
        queue3.add(5);
        queue3.add(4);
        queue3.add(3);
        queue3.add(2);
        queue3.add(1);
        System.out.println(queue3);
        queue3.remove();

        while(!queue3.isEmpty()){
            System.out.println(queue3.remove());
        }
        System.out.println("*************");

//testing QueueReverser
        queue.add(20);
        queue.add(10);
        queue.add(11);
        queue.add(2);
        System.out.println(queue);
        QueueReverser queueReverser = new QueueReverser();
        queueReverser.reverse(queue, 2);
        System.out.println(queue);
        System.out.println("*************");
//testing LinkedListQueue
        LinkedListQueue queue4 = new LinkedListQueue();
        queue4.enqueue(21);
        queue4.enqueue(22);
        queue4.enqueue(23);
        queue4.enqueue(24);
        System.out.println(queue4);
        System.out.println(queue4.size());
        System.out.println(queue4.peek());
        queue4.dequeue();
        queue4.dequeue();
        System.out.println(queue4);
        System.out.println(queue4.isEmpty());


        System.out.println("*************");
//testing StackWithTwoQueues

        StackWithTwoQueues  stack = new StackWithTwoQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

    }
}
