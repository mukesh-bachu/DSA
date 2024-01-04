package J_04_Queues;

import java.util.Arrays;

public class ArrayQueue {
    private int[] array;
    private int front;
    private int rear;
    private int size;
    private int count;
    public ArrayQueue(int length){
        array = new int[length];
        front = 0;
        rear = 0;
        size = length;
    }

    public void enqueue(int item){
        if(size == count)
            throw new IllegalStateException();
        array[rear] = item;
        rear = (rear+1)%size;
        count++;

    }

    public int dequeue(){
        var item = array[front];
        array[front] = 0;
        front = (front+1)%size;
        count--;
        return item;
    }

    public boolean isFull(){
        return size == count;
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();
        return array[front];
    }
    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
       return  Arrays.toString(array);
    }
}
