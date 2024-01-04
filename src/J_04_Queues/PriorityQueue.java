package J_04_Queues;

import java.util.Arrays;

public class PriorityQueue {

    private int[] array = new int[5];
    private int count;

    public void add(int val){
        if(isFull())
            throw new IllegalStateException();
        int i = shiftItemsToInsert(val);
        array[i + 1] = val;
        count++;
    }

    public boolean isFull() {
        return count == array.length;
    }

    private int shiftItemsToInsert(int val) {
        int i;
        for(i = count - 1; i >=0 ; i--){
            if(val > array[i])
                array[i+1] = array[i];
            else 
                break;
        }
        return i;
    }

    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();
        return array[--count];

    }
    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}
